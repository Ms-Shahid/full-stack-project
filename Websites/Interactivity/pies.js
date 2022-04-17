
//adding button to pies page
window.addEventListener("DOMContentLoaded", function(e) {

    const orderButtons = document.querySelectorAll("button[data-order]");

    //we want to order, when the button is clicked
    orderButtons.forEach(function(button) {

        button.addEventListener("click",function(e){
        const button = e.currentTarget; //reference to button
        const container = button.parentNode; //refrence to parentcontainer

        //now let's add some information, about the user selection

        const order ={
            id: button.getAttribute("data-order"),
            title: container.querySelector(".title").innerText,
            price: container.querySelector(".price").innerText,
            desc: container.querySelector(".desc").innerText
        };

        //now let's save this in the local storage
        //localStorage.setItem("order", order);

        //but locastorage does'nt no how save the object, it only now how to save string
        //so in order to conver the  object to string ->

        localStorage.setItem("order", JSON.stringify(order));
        //JSON -> Javascript object Notation, this is an helper object that we can use in order to work with javascript objects.
        //here we are telling take this object and convet to string

        //to save the current location of the browser
        const url = window.location.href.replace("pies.html", "order.html");
        window.location.href = url; //set the browser to new url, which essentially forwards our page to the new order page.
    
        });

    });
});