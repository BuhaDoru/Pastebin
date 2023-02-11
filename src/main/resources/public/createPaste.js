
    fetch(`http://localhost:8080/list/getAll`)
        .then(res => {
         return res.json();
    })
    .then(data => {
      data.forEach(user => {
        const markup = ` <div class="card text-center" style="width: 18rem;">
                          <div class="card-body">
                            <h5 class="card-title">Posted by: ${user.name}</h5>
                             <p class="card-text">${user.content}.</p>
                              <a href="#" class="btn btn-danger" onclick="deleteUser(${user.id}), refresh()">Delete</a>
                           </div>
                        </div>`
        document.querySelector("#allPaste").insertAdjacentHTML(`beforeend`, markup);
       });
    })
   .catch(error => console.log(error));

function refresh() {
        location.reload();
}

function deleteUser(id) {
     fetch('http://localhost:8080/list/list/' + id, {
         method: 'DELETE',
     })
    .then(res => res.text())
    .then(res => console.log(res))
}