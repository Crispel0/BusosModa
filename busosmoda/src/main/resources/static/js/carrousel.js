const carrousel = document.querySelector(".list_img");

const intervale = null;
const stop = 1

const start = () => {
    intervale = setinterval(function () {
        carrousel.scrollLeft = carrousel.scrollLeft + stop;
    },10000);
};
const end = () => {};

start();
