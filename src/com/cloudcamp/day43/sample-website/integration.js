// alert('Hello');
// const element = document.getElementById('para');
// console.log('Inner data: ', element.textContent);

function addSpeciality() {
  const specialityElement = document.getElementById('specialityInput')
  const specialityToBeAdded = specialityElement.value;
  specialityElement.value = null;

  const element = document.createElement('p');
  element.textContent = specialityToBeAdded;

  const specialitiesElement = document.getElementById('specialities');
  specialitiesElement.appendChild(element);
}

function changeData() {
  const element = document.getElementById('para');
  element.textContent = 'Hello world';
  element.style.color = 'red';
  element.classList.add('strong-font');
}

// function loadSpecialities() {
//   const url = 'http://localhost:9854/specialities';
//   const rawResponse = fetch(url);
//   const response = rawResponse.then(function (response) {
//     return response.json();
//   });
//   response.then(function (output) {
//     console.log('Output: ', output);
//   });
// }

// function loadSpecialities() {
//   const url = 'http://localhost:9854/specialities';
//   fetch(url)
//     .then(response => response.json())
//     .then(output => console.log('Output: ', output));
// }

async function loadSpecialities() {
  const url = 'http://localhost:9854/specialities';
  const rawResponse = await fetch(url);
  const specialities = await rawResponse.json();
  for(const speciality of specialities) {
    const tr = document.createElement('tr');
    const td1 = document.createElement('td');
    const td2 = document.createElement('td');
    const td3 = document.createElement('td');

    td1.textContent = speciality.id;
    td2.textContent = speciality.name;
    td3.textContent = speciality.description;
    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);

    const specialitiesElement = document.getElementById('specialitiesRows');
    specialitiesElement.appendChild(tr);
  }
}

loadSpecialities();
