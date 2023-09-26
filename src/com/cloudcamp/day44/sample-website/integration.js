async function loadSpecialities() {
  const url = 'http://localhost:9854/specialities';
  const rawResponse = await fetch(url);
  const specialities = await rawResponse.json();
  const specialitiesElement = document.getElementById('specialitiesRows');

  specialitiesElement.innerHTML = null;

  for(const speciality of specialities) {
    const tr = document.createElement('tr');
    const td1 = document.createElement('td');
    const td2 = document.createElement('td');
    const td3 = document.createElement('td');
    const td4 = document.createElement('td');

    td1.textContent = speciality.id;
    td2.textContent = speciality.name;
    td3.textContent = speciality.description;
    td4.innerHTML = `
      <button class="btn btn-danger" onclick="deleteSpeciality(${speciality.id})"><i class="bi-trash"></i></button>
    `;

    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);
    tr.appendChild(td4);

    specialitiesElement.appendChild(tr);
  }
}

async function addSpeciality() {
  const nameElement = document.getElementById('specialityNameInput');
  const descriptionElement = document.getElementById('specialityDescriptionInput');

  const name = nameElement.value;
  const description = descriptionElement.value;

  if (name.length === 0) {
    nameElement.classList.add('is-invalid');
  } else {
    nameElement.classList.remove('is-invalid');
  }

  if (description.length === 0) {
    descriptionElement.classList.add('is-invalid');
  } else {
    descriptionElement.classList.remove('is-invalid');
  }

  if (name.length > 0 && description.length > 0) {

    const requestBody = {
      'name': name,
      'description': description
    };

    const url = 'http://localhost:9854/specialities';
    const rawResponse = await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(requestBody)
    });

    document.getElementById('addSpecialityForm').reset();

    loadSpecialities();
  }
}

async function deleteSpeciality(id) {
  const url = `http://localhost:9854/specialities/${id}`;
  await fetch(url, {
    method: 'DELETE'
  });

  loadSpecialities();
}

loadSpecialities();
