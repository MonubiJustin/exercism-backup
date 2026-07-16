const colors = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"] as const;

type Color = typeof colors[number];

export function decodedResistorValue([band1, band2, band3]: Color[]) {
  
  const colorMap = {
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
  }

  const colorZeros = {
    black: 1,
    brown: 10,
    red: 100,
    orange: 1000,
    yellow: 10000,
    green: 100000,
    blue: 1000000,
    violet: 10000000,
    grey: 100000000,
    white: 1000000000
  }

  const resistance = Number(`${colorMap[band1]}${colorMap[band2]}`) * colorZeros[band3];

  if (resistance === 0) return `${resistance} ohms`;


  if (resistance % colorZeros.white === 0) return `${resistance / colorZeros.white} gigaohms`;
  if (resistance % colorZeros.blue === 0) return `${resistance / colorZeros.blue} megaohms`;
  if (resistance % colorZeros.orange === 0) return  `${resistance / colorZeros.orange} kiloohms`;

  return `${resistance} ohms`;

  
}
