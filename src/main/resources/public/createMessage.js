function refresh() {
        location.reload();
        document.getElementById("Message").innerHTML += `
                <div class="card text-bg-danger mb-3"">
                    <div class="card-body">
                          <h5 class="card-title">Your Paste has been added!</h5>
                    </div>
                </div>`;
      }

function redirect () {
    windows.location.href = "http://localhost:8080/createPaste.html"
 }