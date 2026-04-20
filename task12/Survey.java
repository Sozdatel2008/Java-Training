package task12;

public class Survey {

    //Packing and unpacking survey results
    public static void main(String[] args) {
        int sex = 1; //0 or 1
        int marit = 2; //from 0 to 3
        int age = 3; //from 0 to 3
        int edu = 3; //from 0 to 3
        int place = 2; //from 0 to 3
        int region = 15; //from 0 to 15
        int answer = 6; //from 0 to 7

        info(encode(sex, marit, age, edu, place, region, answer));
    }

    static short encode(int sex, int marit, int age, int edu, int place, int region, int answer){
        int result = (answer << 13)| (region << 9)| (place << 7)| (edu << 5) | (age << 3) | (marit << 1) | sex;
        return (short) result;
    }

    static void info(short code){
        int c = code & 0xFFFF;

        int sex_unpacked = (c & 0x1);
        int marit_unpacked = (c >>> 1) & 0x3;
        int age_unpacked = (c >>> 3) & 0x3;
        int edu_unpacked = (c >>> 5) & 0x3;
        int place_unpacked = (c >>> 7) & 0x3;
        int region_unpacked = (c >>> 9) & 0xF;
        int answer_unpacked = (c >>> 13) & 0x7;
        System.out.println("sex: " + sex_unpacked);
        System.out.println("marital status: " + marit_unpacked);
        System.out.println("age group: " + age_unpacked);
        System.out.println("education: " + edu_unpacked);
        System.out.println("living place: " + place_unpacked);
        System.out.println("region: " + region_unpacked);
        System.out.println("answer: " + answer_unpacked);
    }
}
