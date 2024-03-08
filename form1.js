
    const number1 = document.getElementById("number1");
    const number2 = document.getElementById("number2");
    const addButton = document.getElementById("cong");
    const subtractButton = document.getElementById("tru");
    const multiplyButton = document.getElementById("nhan");
    const divideButton = document.getElementById("chia");

    addButton.addEventListener("click", function() {
      const sum = number1.value + number2.value;
      alert(`Tổng: ${sum}`);
    });

    subtractButton.addEventListener("click", function() {
      const difference = number1.value - number2.value;
      alert(`Hiệu: ${difference}`);
    });

    multiplyButton.addEventListener("click", function() {
      const product = number1.value * number2.value;
      alert(`Tích: ${product}`);
    });

    divideButton.addEventListener("click", function() {
      const quotient = number1.value / number2.value;
      alert(`Thương: ${quotient}`);
    });
