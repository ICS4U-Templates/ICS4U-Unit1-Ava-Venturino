/*
 * This is a program that calculates the area of a circle.
 *
 * @author  Ava Venturino
 * @version 1.0
 * @since   2024-02-20
 */

import { createPrompt } from 'bun-promptx'

// input
const massString = createPrompt("Enter the mass of an object in killograms: ")
const speedOfLight = 299792458
// error checking
const mass = parseFloat(massString.value || "-1")
if (isNaN(mass) == true || mass < 0) {
console.log("Invalid input.")
} else {
// process
const energy  = mass * Math.pow(speedOfLight, 2)
// output
console.log(` ${mass} kg of mass would produce ${energy.toExponential(3)} J of energy.`)
           }

console.log("\nDone.")
