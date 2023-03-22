public class Main {
    public static void main(String[] args) {
/*
        // Task 1
        int totalAmountOfMoney = 100;
        int spentMoney = 45;
        int maximumAmountOfMoney = 100;
        int totalAmountOfChange = totalAmountOfMoney - spentMoney;
        int oneDollarBill = 1;
        int twoDollarBill = 2;
        int tenDollarBill = 10;
        int twentyDollarBill = 20;

        System.out.println("Task 1: ");

        if (totalAmountOfMoney > maximumAmountOfMoney) {
            System.out.println("You have too much money.");
        }

        if (spentMoney <= 0) {
            System.out.println("You didn't buy anything did you.");
            if (spentMoney < 0) {
                System.out.println("Did you maybe break something?");
            }
        } else {
            int temporaryChange = 0;
            System.out.println("Total change is: " + totalAmountOfChange + " KM");
            System.out.println("20 KM = " + totalAmountOfChange / twentyDollarBill);
            temporaryChange = totalAmountOfChange % twentyDollarBill;

            System.out.println("10 KM = " + temporaryChange / tenDollarBill);
            temporaryChange = totalAmountOfChange % tenDollarBill;

            System.out.println("2 KM = " + temporaryChange / twoDollarBill);
            temporaryChange = totalAmountOfChange % twoDollarBill;

            System.out.println("1 KM = " + temporaryChange);
        }

        // Bonus
        int amountOfTwenties = 2;
        int amountOfTens = 10;
        int amountOfTwos = 10;
        int amountOfOnes = 7;
        spentMoney = 40;
        totalAmountOfMoney = amountOfTwenties * twentyDollarBill + amountOfTens * tenDollarBill + amountOfTwos * twoDollarBill + amountOfOnes * oneDollarBill;
        totalAmountOfChange = totalAmountOfMoney - spentMoney;
        System.out.println("\nBonus: ");
        System.out.println("Money in cash register before returning change: " + totalAmountOfMoney + "\nBanknotes: " + "\n20 KM - " + amountOfTwenties + "\n10 KM - " + amountOfTens + "\n2 KM - " + amountOfTwos + "\n1 KM - " + amountOfOnes + "\nTotal bill: " + spentMoney + " KM\nChange: " + totalAmountOfChange + " KM\n");

        if (totalAmountOfChange > totalAmountOfMoney) {
            System.out.println("Sorry the cash register does not have the required amount of money.");
        } else {
            int temporaryChange = totalAmountOfChange;
            if (amountOfTwenties > 0) {
                if (temporaryChange / twentyDollarBill <= amountOfTwenties) {
                    amountOfTwenties = amountOfTwenties - temporaryChange / twentyDollarBill;
                    temporaryChange = temporaryChange - (temporaryChange / twentyDollarBill) * twentyDollarBill;
                } else if (temporaryChange / twentyDollarBill > amountOfTwenties){
                    temporaryChange = temporaryChange - amountOfTwenties * twentyDollarBill;
                    amountOfTwenties = 0;
                }
            }

            if (amountOfTens > 0) {
                if (temporaryChange / tenDollarBill <= amountOfTens) {
                    amountOfTens = amountOfTens - temporaryChange / tenDollarBill;
                    temporaryChange = temporaryChange - (temporaryChange / tenDollarBill) * tenDollarBill;
                } else if (temporaryChange / tenDollarBill > amountOfTens){
                    temporaryChange = temporaryChange - amountOfTens * tenDollarBill;
                    amountOfTens = 0;
                }
            }

            if (amountOfTwos > 0) {
                if (temporaryChange / twoDollarBill <= amountOfTwos) {
                    amountOfTwos = amountOfTwos - temporaryChange / twoDollarBill;
                    temporaryChange = temporaryChange - (temporaryChange / twoDollarBill) * twoDollarBill;
                } else if (temporaryChange / twoDollarBill > amountOfTwos){
                    temporaryChange = temporaryChange - amountOfTwos * twoDollarBill;
                    amountOfTwos = 0;
                }
            }

            if (amountOfOnes > 0) {
                if (temporaryChange / oneDollarBill <= amountOfOnes) {
                    amountOfOnes = amountOfOnes - temporaryChange / oneDollarBill;
                    temporaryChange = temporaryChange - (temporaryChange / oneDollarBill) * oneDollarBill;
                } else if (temporaryChange / oneDollarBill > amountOfOnes){
                    temporaryChange = temporaryChange - amountOfOnes * oneDollarBill;
                    amountOfOnes = 0;
                }
            }

            if (temporaryChange == 0) {
                totalAmountOfMoney = amountOfTwenties * twentyDollarBill + amountOfTens * tenDollarBill + amountOfTwos * twoDollarBill + amountOfOnes * oneDollarBill;
                System.out.println("Money in cash register after returning change: " + totalAmountOfMoney + "\nBanknotes: " + "\n20 KM - " + amountOfTwenties + "\n10 KM - " + amountOfTens + "\n2 KM - " + amountOfTwos + "\n1 KM - " + amountOfOnes);
            } else {
                System.out.println("Sorry the cash register does not have the required amount of money.");
            }
        }
 */
        // Task1 + Bonus + Super Duper Sega Mega Bonus
        long oneDollarBill = 1;
        long twoDollarBill = 2;
        long tenDollarBill = 10;
        long twentyDollarBill = 20;
        double fiftyCents = 0.5;
        double twentyCents = 0.2;
        double tenCents = 0.1;
        double oneCent = 0.01;
        long amountOfTwenties = 1;
        long amountOfTens = 5;
        long amountOfTwos = 5;
        long amountOfOnes = 2;
        long amountOfFiftyCents = 5;
        long amountOfTwentyCents = 3;
        long amountOfTenCents = 3;
        long amountOfOneCent = 9;

        long moneyInTwenties = amountOfTwenties * twentyDollarBill;
        long moneyInTens = amountOfTens * tenDollarBill;
        long moneyInTwos = amountOfTwos * twoDollarBill;
        long moneyInOnes = amountOfOnes * oneDollarBill;
        double moneyInFiftyCents = amountOfFiftyCents * fiftyCents;
        double moneyInTwentyCents = amountOfTwentyCents * twentyCents;
        double moneyInTenCents = amountOfTenCents * tenCents;
        double moneyInOneCent = amountOfOneCent * oneCent;
        double totalAmountOfMoney = moneyInTwenties + moneyInTens + moneyInTwos + moneyInOnes + moneyInFiftyCents +
                moneyInTwentyCents + moneyInTenCents + moneyInOneCent;

        double spentMoney = 35.78;
        double maximumAmountOfMoney = 100;
        double totalAmountOfChange = Math.round((totalAmountOfMoney - spentMoney) * 100.0) / 100.0;
        System.out.println("Task1 + Bonus + Super Duper Sega Mega Bonus: ");
        System.out.println("Money in cash register before returning change: " + totalAmountOfMoney);
        System.out.println("Banknotes in register:");
        System.out.println("20 KM - " + amountOfTwenties);
        System.out.println("10 KM - " + amountOfTens);
        System.out.println("2 KM - " + amountOfTwos);
        System.out.println("1 KM - " + amountOfOnes);
        System.out.println("0.50 KM - " + amountOfFiftyCents);
        System.out.println("0.20 KM - " + amountOfTwentyCents);
        System.out.println("0.10 KM - " + amountOfTenCents);
        System.out.println("0.01 KM - " + amountOfOneCent);
        System.out.println("Total bill: " + spentMoney + " KM");
        System.out.println("Change: " + totalAmountOfChange + " KM\n");

        if (totalAmountOfMoney > maximumAmountOfMoney) {
           System.out.println("You have too much money.");
        }

        if (spentMoney <= 0) {
            System.out.println("You didn't buy anything did you.");
            if (spentMoney < 0) {
                System.out.println("Did you maybe break something?");
            }
        } else if (totalAmountOfChange > totalAmountOfMoney || spentMoney > totalAmountOfMoney) {
            System.out.println("Sorry the cash register does not have the required amount of money.");
        } else if (totalAmountOfMoney < maximumAmountOfMoney) {
            double temporaryChange = totalAmountOfChange;
            long countTwenties = 0;
            long countTens = 0;
            long countTwos = 0;
            long countOnes = 0;
            long countFiftyCents = 0;
            long countTwentyCents = 0;
            long countTenCents = 0;
            long countOneCent = 0;
            if (amountOfTwenties > 0) {
                long twentiesToUse = Math.round(Math.floor(temporaryChange / twentyDollarBill));

                if (twentiesToUse <= amountOfTwenties) {
                    amountOfTwenties = amountOfTwenties - twentiesToUse;
                    countTwenties = twentiesToUse;
                    temporaryChange = temporaryChange - twentiesToUse * twentyDollarBill;
                } else if (twentiesToUse > amountOfTwenties) {
                    temporaryChange = temporaryChange - amountOfTwenties * twentyDollarBill;
                    countTwenties = amountOfTwenties;
                    amountOfTwenties = 0;
                }
            }

            if (amountOfTens > 0) {
                long tensToUse = Math.round(Math.floor(temporaryChange / tenDollarBill));
                if (tensToUse <= amountOfTens) {
                    amountOfTens = amountOfTens - tensToUse;
                    countTens = Math.round(tensToUse);
                    temporaryChange = temporaryChange - tensToUse * tenDollarBill;
                } else if (tensToUse > amountOfTwenties) {
                    temporaryChange = temporaryChange - amountOfTens * tenDollarBill;
                    countTwenties = amountOfTwenties;
                    amountOfTens = 0;
                }
            }

            if (amountOfTwos > 0) {
                long twosToUse = Math.round(Math.floor(temporaryChange / twoDollarBill));
                if (twosToUse <= amountOfTwos) {
                    amountOfTwos = amountOfTwos - twosToUse;
                    countTwos = twosToUse;
                    temporaryChange = temporaryChange - twosToUse * twoDollarBill;
                } else if (twosToUse > amountOfTwos) {
                    temporaryChange = temporaryChange - amountOfTwos * twoDollarBill;
                    countTwos = amountOfTwos;
                    amountOfTwos = 0;
                }
            }

            if (amountOfOnes > 0) {
                long onesToUse = Math.round(Math.floor(temporaryChange / oneDollarBill));
                if (onesToUse <= amountOfOnes) {
                    amountOfOnes = amountOfOnes - onesToUse;
                    countOnes = onesToUse;
                    temporaryChange = temporaryChange - onesToUse * oneDollarBill;
                } else if (onesToUse > amountOfOnes) {
                    temporaryChange = temporaryChange - amountOfOnes * oneDollarBill;
                    countOnes = amountOfOnes;
                    amountOfOnes = 0;
                }
            }

            if (amountOfFiftyCents > 0) {
                long fiftyCentsToUse = Math.round(Math.floor(temporaryChange / fiftyCents));
                if (fiftyCentsToUse <= amountOfFiftyCents) {
                    amountOfFiftyCents = amountOfFiftyCents - fiftyCentsToUse;
                    countFiftyCents = fiftyCentsToUse;
                    temporaryChange = temporaryChange - fiftyCentsToUse * fiftyCents;
                } else if (fiftyCentsToUse > amountOfFiftyCents) {
                    temporaryChange = temporaryChange - amountOfFiftyCents * fiftyCents;
                    countFiftyCents = amountOfFiftyCents;
                    amountOfFiftyCents = 0;
                }
            }

            if (amountOfTwentyCents > 0) {
                long twentyCentsToUse = Math.round(Math.floor(temporaryChange / twentyCents));
                if (twentyCentsToUse <= amountOfTwentyCents) {
                    amountOfTwentyCents = amountOfTwentyCents - twentyCentsToUse;
                    countTwentyCents = twentyCentsToUse;
                    temporaryChange = temporaryChange - twentyCentsToUse * twentyCents;
                } else if (twentyCentsToUse > amountOfTwentyCents) {
                    temporaryChange = temporaryChange - amountOfTwentyCents * twentyCents;
                    countTwentyCents = amountOfTwentyCents;
                    amountOfTwentyCents = 0;
                }
            }

            if (amountOfTenCents > 0) {
                long tenCentsToUse = Math.round(Math.floor(temporaryChange / tenCents));
                if (tenCentsToUse <= amountOfTenCents) {
                    amountOfTenCents = amountOfTenCents - tenCentsToUse;
                    countTenCents = tenCentsToUse;
                    temporaryChange = temporaryChange - tenCentsToUse * tenCents;
                } else if (tenCentsToUse > amountOfTenCents) {
                    temporaryChange = temporaryChange - amountOfTenCents * tenCents;
                    countTenCents = amountOfTenCents;
                    amountOfTenCents = 0;
                }
            }

            if (amountOfOneCent > 0) {
                long oneCentToUse = Math.round(Math.floor(temporaryChange / oneCent));
                if (oneCentToUse <= amountOfOneCent) {
                    amountOfOneCent = amountOfOneCent - oneCentToUse;
                    countOneCent = oneCentToUse;
                    temporaryChange = temporaryChange - oneCentToUse * oneCent;
                } else if (oneCentToUse > amountOfOneCent) {
                    temporaryChange = temporaryChange - amountOfOneCent * oneCent;
                    countOneCent = amountOfOneCent;
                    amountOfOneCent = 0;
                }
            }

            if (Math.round((temporaryChange) * 100.0) / 100.0 == 0) {
                double remainingMoney = Math.round((totalAmountOfMoney - totalAmountOfChange) * 100.0) / 100.0;
                System.out.println("Money in cash register after returning change: " + remainingMoney);
                System.out.println("Banknotes in register:");
                System.out.println("20 KM - " + amountOfTwenties);
                System.out.println("10 KM - " + amountOfTens);
                System.out.println("2 KM - " + amountOfTwos);
                System.out.println("1 KM - " + amountOfOnes);
                System.out.println("0.50 KM - " + amountOfFiftyCents);
                System.out.println("0.20 KM - " + amountOfTwentyCents);
                System.out.println("0.10 KM - " + amountOfTenCents);
                System.out.println("0.01 KM - " + amountOfOneCent);

                double givenChange = Math.round((totalAmountOfChange) * 100.0) / 100.0;
                System.out.println("Change given to customer: " + givenChange);
                System.out.println("20 KM - " + countTwenties);
                System.out.println("10 KM - " + countTens);
                System.out.println("2 KM - " + countTwos);
                System.out.println("1 KM - " + countOnes);
                System.out.println("0.50 KM - " + countFiftyCents);
                System.out.println("0.20 KM - " + countTwentyCents);
                System.out.println("0.10 KM - " + countTenCents);
                System.out.println("0.01 KM - " + countOneCent);
            } else {
                System.out.println("Sorry the cash register does not have the required amount of money.");
            }
        }

        // Task 2
        double circleRadius = 2;
        System.out.println("\nTask 2: ");

        double circleArea = 2 * circleRadius * circleRadius * Math.PI;
        System.out.println("Area of the circle with a radius of " + circleRadius + " is " + circleArea + ".");

        // Task 3
        int numberA = 60;
        int numberB = 5;
        int lowerLimit = 10;
        int divisibilityValue = 3;
        int upperLimit = 10000;
        System.out.println("\nTask 3: ");

        if ((numberA > lowerLimit) && (numberA % divisibilityValue == 0) && (numberA < upperLimit)){
            if (numberA % numberB == 0) {
                System.out.println("Number " + numberA + " is divisible by " + numberB + ".");
            } else {
                System.out.println("Number " + numberA + " is not divisible by " + numberB + ".");
            }
        } else {
            System.out.println("Conditions are not met for number " + numberA + ".");
        }

        // Task 4
        numberA = 60;
        numberB = 5;
        System.out.println("\nTask 4: ");

        if (numberA > numberB) {
            System.out.print("Number A = " + numberA + " is greater than number B = " + numberB + ".");
            System.out.println(" Sum of these numbers is: " + (numberA + numberB) + ".");
        } else if (numberA < numberB) {
            System.out.print("Number B = " + numberB + " is greater than number A = " + numberA + ".");
            System.out.println(" Difference of these numbers is: " + (numberB - numberA) + ".");
        } else if (numberA == numberB) {
            System.out.print("Number A = " + numberA + " is equal to number B = " + numberB + ".");
            System.out.println(" Product of these numbers is: " + (numberA * numberB) + ".");
        }

        // Task 5
        int numberX = 3;
        System.out.println("\nTask 5: ");

        int result = (((numberX + numberX + 6) / 2) - numberX);
        if (result % 2 == 0) {
            System.out.println("Conditions are met. Number " + result + " is divisible by 2.");
        } else {
            System.out.println("Conditions are not met. Number " + result + " is not divisible by 2.");
        }

        // Task 6
        numberA = 10;
        numberB = 20;
        int numberC = 35;
        int numberD = 50;
        System.out.println("\nTask 6: ");

        if ((numberA > 0 && numberB > 0) || (numberC > 0 && numberD > 0)) {
            int sum = numberA + numberB + numberC + numberD;
            if (sum > 100) {
                if (sum % 2 == 0) {
                    sum = sum / 2;
                } else {
                    sum = sum - 1;
                    if (sum % 2 == 0) {
                        sum /= 2;
                    } else {
                        System.out.println("The number is still not divisible by 2.");
                    }
                }
            }
            System.out.println("The variable 'sum' has value of " + sum + ".");
        }
    }
}
