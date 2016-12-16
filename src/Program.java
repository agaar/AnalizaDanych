import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Program {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(args[0]));
        String firstLine = scanner.nextLine();

        int operationNumber = Integer.parseInt(args[1]);

        List<MarkerInterface> list = new ArrayList<>();
        if (args[0].contains("ludzie")) {

            while (scanner.hasNext()) {
                String[] personDetails = scanner.nextLine().split(",");
                Person person = new Person(personDetails[0], personDetails[1], personDetails[2], personDetails[3],
                        personDetails[4], personDetails[5]);
                list.add(person);
            }

        } else if (args[0].contains("psy")) {
            while (scanner.hasNext()) {
                String[] animalDetails = scanner.nextLine().split(",");
                Animal animal;

                if (animalDetails.length == 4) {
                    animal = new Animal(animalDetails[0], animalDetails[1], animalDetails[2], animalDetails[3]);
                } else {
                    animal = new Animal(animalDetails[0], animalDetails[1], animalDetails[2], animalDetails[3], animalDetails[4]);
                }
                list.add(animal);
            }
        } else if (args[0].contains("rowerzysci")) {
            while (scanner.hasNext()) {
                String[] bikerDetails = scanner.nextLine().split(",");
                Biker biker;

                if (bikerDetails.length == 4) {
                    biker = new Biker(bikerDetails[0], bikerDetails[1], bikerDetails[2], bikerDetails[3]);
                } else {
                    biker = new Biker(bikerDetails[0], bikerDetails[1], bikerDetails[2], bikerDetails[3], bikerDetails[4]);
                }
                list.add(biker);
            }
        }

        switch (operationNumber) {
            case 1:
                for (int i = 0; i < Math.min(10, list.size()); i++) {
                    System.out.println(list.get(i));
                }
                break; 
            case 2:
                System.out.println(list.size());
                break;
            case 3:
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId() > Integer.parseInt(args[2])) System.out.println(list.get(i));
                }
                break;
            case 4:
                List<String> nameList = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    nameList.add(list.get(i).getName());                         //list of all names with duplicates
                }

                Map<String, Integer> nameMap = new TreeMap<>();
                for(String word: nameList) {
                        Integer count = nameMap.get(word);
                        nameMap.put(word, (count==null) ? 1 : count+1);          //adds names with numbers to the map
                }

                Map<String, Integer> sortedMapDesc = sortDescByComparator(nameMap);

                //Prints a map:
                for(Map.Entry<String, Integer> entry : sortedMapDesc.entrySet()) {
                        if(entry.getValue() > 100) System.out.println(entry.getKey() + " " + entry.getValue());
                        else System.out.println(entry.getKey());
                }
                break;
            case 5:
                int requiredId = Integer.parseInt(args[2]);
                for(int i = 0; i < list.size(); i++) {
                    if(list.get(i).getId() == requiredId) {
                        System.out.println(list.get(i).getName());          //shows name of element with required id
                        //TODO jeśli element posiada parent_id to wyświetlić liczbę rodziców do samej góry
                    }
                }
                break;
            case 6:
                double ageSum = 0;
                double averageAge = 0;
                for(int i = 0; i < list.size(); i++) {
                    ageSum += list.get(i).getAge();
                    averageAge = ageSum/list.size();
                }
                System.out.println(averageAge);
                break;
            case 7:
                List<Integer> ageList = new ArrayList<>();
                for (MarkerInterface aList : list) {
                    ageList.add(aList.getAge());                                //list of all ages with duplicates
                }
                int maxAge = Collections.max(ageList);
                int minAge = Collections.min(ageList);
                double range = (maxAge-minAge)/4.0;

                double count1 = 0;
                double count2 = 0;
                double count3 = 0;
                double count4 = 0;

                for (int age : ageList) {
                    if(age <= (minAge+range)) count1++;
                    else if(age <= (minAge+2*range)) count2++;
                    else if(age <= (maxAge-range)) count3++;
                    else count4++;
                }

                System.out.println("max wiek to " + maxAge + ", min to " + minAge + ", przedział 25% to " + range);
                System.out.print(minAge + "-" + (minAge+range) + ": ");
                System.out.printf("%.2f", count1*100/ageList.size());
                System.out.println("%");
                System.out.print(minAge+range + "-" + (minAge+2*range) + ": ");
                System.out.printf("%.2f", count2*100/ageList.size());
                System.out.println("%");
                System.out.print(minAge+2*range + "-" + (maxAge-range) + ": ");
                System.out.printf("%.2f", count3*100/ageList.size());
                System.out.println("%");
                System.out.print(maxAge-range + "-" + maxAge+ ": ");
                System.out.printf("%.2f", count4*100/ageList.size());
                System.out.println("%");

                break;
            default:
                System.out.println("Podaj opcje od 1 do 7");
        }
    }


    private static Map<String,Integer> sortDescByComparator(Map<String, Integer> nameMap) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(nameMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
