const navMenuButton = document.querySelector(".nav-menu-button");
const nav = document.querySelector("nav");

navMenuButton.onmouseover = () => {
    nav.classList.remove("nav-invisible");
}

navMenuButton.onmouseout = () => {
    nav.classList.add("nav-invisible");
}

nav.onmouseover = () => {
    nav.classList.remove("nav-invisible");
}

nav.onmouseout = () => {
    nav.classList.add("nav-invisible");
}

const mainForwardButton = document.querySelector(".site-logo");

mainForwardButton.onclick = () => {
    location.href = "/main/main";
}