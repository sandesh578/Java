package generics;

class Holders {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}

class NonGenericExample {
    public static void main(String... args) {
        Holders holder = new Holders();
        holder.set(256);

        // correct the line to make the code compiled
        int value =(int) holder.get();

        // do not change
        System.out.println(value);
    }
}

