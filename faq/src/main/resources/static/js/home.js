const expandButtons = document.querySelectorAll(".expand-button");
expandButtons.forEach((btn) => btn.addEventListener("click", onClick));

function onClick(event) {
  console.log(event.target);

  const currentButton = event.target;

  currentButton.innerText = currentButton.innerText === "+" ? "-" : "+";

  const currentParent = currentButton.closest(".faq");

  const currentAnswer = currentParent.querySelector(".answer");
  currentAnswer.classList.toggle("hide");
}
