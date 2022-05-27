const get_film_info = document.getElementById("get_film_info");
const result_title = document.getElementById("result_title");
const result_year = document.getElementById("result_year");
const result_director = document.getElementById("result_director");

get_film_info.addEventListener('click', getAPI);

let endPoint = 'http://www.omdbapi.com/?i=tt3896198&apikey=3662ddd';

function getAPI(){
    fetch(endPoint, {
		method: 'GET'
	})
    .then(res => res.json())
    .then(data=> {
        result_title.innerHTML=data.Title;
        result_year.innerHTML=data.Year;
        result_director.innerHTML=data.Director;
    });
}