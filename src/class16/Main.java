package class16;
class Main{
    private String maxLength(String []array){
        int num=0;
        int size = array[0].length();
        for (int i=0; i<array.length; i++){
            if (array[i].length()>size){
                num=i;
                size=array[i].length();
            }
        }
        return array[num];
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String[] array= {"hey","yolo","hi","this is long"};
        System.out.println(obj.maxLength(array));
        //should print "this is long"
    }
}

