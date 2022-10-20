package lesson6;

public class Animal {
        protected String type;
        protected String name;
        protected int swim;
        protected int run;
        private static int count;


        public Animal() {
            count++;
        }

        public static int getCount() {

            return count;
        }


        @Override
        public String toString() {
            return  "Вид/порода: '" + type + '\'' +
                    ", Кличка: '" + name + "\' \n:" +
                    ", Может проплыть " + swim + "м. " +
                    ", Может пробежать " + run + "м. ";
        }

        public void run(int distance) {
            if (run <= distance) {
                System.out.println(this.type + " по кличке " + this.name + "  пробежал " + distance + "м.");
            } else {
                System.out.println(this.type + " по кличке " + this.name + " не пробежал ");
            }
        }

        public void swim(int distance) {
            if (swim <= distance) {
                System.out.println(this.type + " по кличке " + this.name + "   проплыл " + distance + "м.");
            } else {
                System.out.println(this.type + " по кличке " + this.name + " не проплыл ");
            }
        }
}




