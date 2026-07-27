export function format(name: string, number: number): string {
  let ordinalNumeral: string;
  if (number % 100 !== 11 && number % 10 === 1)
    ordinalNumeral = "st";
  else if (number % 100 !== 12 && number % 10 === 2)
    ordinalNumeral = "nd";
  else if (number % 100 !== 13 && number % 10 === 3)
    ordinalNumeral = "rd"
  else
    ordinalNumeral = "th"

  return `${name}, you are the ${number}${ordinalNumeral} customer we serve today. Thank you!`;
}
