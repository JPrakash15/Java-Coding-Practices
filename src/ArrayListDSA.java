import java.util.*;

public class ArrayListDSA {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,4,5,6,7));
        List<Integer> list2=new ArrayList<>(Arrays.asList(2,3,7,8));
        Set<Integer> newset=new HashSet<>();
        Set<Integer> newSet=new HashSet<>();
        //        list.removeAll(list2);
//        list2.retainAll(list);
        System.out.println(list2);

        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            int num= itr.next();
            System.out.println(num);
            newset.add(num);
        }
        Iterator<Integer> it=list2.iterator();
        while(it.hasNext()){
            int num= it.next();
            System.out.println(num);
            newSet.add(num);
        }
        System.out.println(newset);
        System.out.println(newSet);
        boolean is=newset.containsAll(newSet);
        newset.retainAll(newSet);
        System.out.println(newset);

        List<Character> charList= new ArrayList<>(Arrays.asList('A','B','C','B','A','A'));
        char let='A';
        remOccur(charList,let);
        System.out.println(charList);

        mergeList(list,list2);
        System.out.println(list);

//        System.out.println(Arrays.toString(findDups(list)));
    }
//    Q1:How do you find the duplicate elements in a list?
    static int[] findDups(List<Integer> list){
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dups=new HashSet<>();
        for(int num:list){
            if(!seen.add(num)){
                dups.add(num);
            }
        }
        return converSetToIntArray(dups);

    }

    static int[] converSetToIntArray(Set<Integer> set){
        int[] numArr=new int[set.size()];
        Integer[] integerArr=set.toArray(new Integer[0]);
        int i=0;
        while(i< set.size()){
            numArr[i]=integerArr[i];
            i++;
        }
        return numArr;
    }

//    Q2:Remove all occurences of specific list?

    static List<Character> remOccur(List<Character> charList, char let){
    charList.removeIf(e->e.equals(let));
    return charList;
    }

//
    static List<Integer> mergeList(List<Integer> list, List<Integer> list2){
        list.addAll(list2);
        return list;
    }

}