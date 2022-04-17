
//load the DOM object in the order list
window.addEventListener("DOMContentLoaded", function(e){

    //geting the location and latitude and longitude value of user
    let locationBox = document.querySelector("#location");

    let location = {
        latitude:"unknown",
        longitude:"unknown"
    };

    //get the current position of user
    window.navigator.geolocation.getCurrentPosition(
        //getcurrentposition has two value one for success-rate and one for error-rate

        function(position){
            location ={
                latitude : position.coords.latitude,
                longitude : position.coords.longitude
            };
            locationBox.value = JSON.stringify(location); //this will the value of location 

        },
        function(error){
            //here we take the default value and serializing them, and setting them inside the box
            locationBox.value = JSON.stringify(location);
        });

    
    const order = localStorage.getItem("order");

    if (order){

        //here we take the string and turn into object
        const pieOrder = JSON.parse(order);

        //this passes in the pie order

        const orderInput = document.querySelector("#pie-order");
        orderInput.value = order; //

        //reference to .pie class in div section 
        const pie = document.querySelector(".pie");

        //now that we have the data, we can show up the image and the reference to those objects
        const title = pie.querySelector(".title");
        const price = pie.querySelector(".price");
        const desc = pie.querySelector(".desc");

        //once we have reference to those elements, I can update their inner-properties

        title.innerText = pieOrder.title;
        price.innerText = pieOrder.price;
        desc.innerText = pieOrder.desc;


        //selecting the appropriate image  in order list
        const img = pie.querySelector("img");
        img.setAttribute("src", `../images/${pieOrder.id}.png`);
        
        //adding some alt attribute to image
        img.setAttribute("alt", pieOrder.title);
    }

});