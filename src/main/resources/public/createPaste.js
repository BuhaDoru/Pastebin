
    fetch(`http://localhost:8080/paste/getAll`)
        .then(res => {
         return res.json();
    })
    .then(data => {
      data.forEach(user => {
        const markup = `<div class="col-md-10 mx-auto col-lg-5">
                            <div class="row">
                              <div class="col-sm-6">
                                <div class="card text-center">
                                  <div class="card-body">
                                    <h5 class="card-title">Posted by: ${user.name}</h5>
                                    <p class="card-text">${user.content}.</p>
                                    <a href="#" class="btn btn-danger" onclick="deleteUser(${user.id}), refresh()">Delete</a>
                                  </div>
                                </div>
                              </div>
                            </div>`
        document.querySelector("#allPaste").insertAdjacentHTML(`beforebegin`, markup);
       });
    })
   .catch(error => console.log(error));

function refresh() {
        location.reload();
}

function deleteUser(id) {
     fetch('http://localhost:8080/paste/delete/' + id, {
         method: 'DELETE',
     })
    .then(res => res.text())
    .then(res => console.log(res))
}