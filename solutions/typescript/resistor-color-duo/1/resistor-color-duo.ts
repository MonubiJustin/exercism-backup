type Color = "black" | "brown" | "red" | "orange" | "yellow" | "green" | "blue" | "violet" | "grey" | "white";

export function decodedValue(colors: Color[]) {
  const firstColor = colors[0];
  const secondColor = colors[1];


  const colorCodes = {
    black: 0,
    brown: 1,
    red: 2,
    orange: 3,
    yellow: 4,
    green: 5,
    blue: 6,
    violet: 7,
    grey: 8,
    white: 9
  };

 const result = Number(`${colorCodes[firstColor]}${colorCodes[secondColor]}`);

  return result;
}
