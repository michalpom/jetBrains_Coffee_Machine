class Army {

    public static void createArmy() {
        // Implement this method
        //5 Unit, 3 Knight, 1 General, 1 Doctor
        Unit unit1 = new Unit("Name1");
        Unit unit2 = new Unit("Name2");
        Unit unit3 = new Unit("Name3");
        Unit unit4 = new Unit("Name4");
        Unit unit5 = new Unit("Name5");

        Knight knight1 = new Knight("Knight1");
        Knight knight2 = new Knight("Knight2");
        Knight knight3 = new Knight("Knight3");

        General general = new General("General1");

        Doctor doctor = new Doctor("Doctor1");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}