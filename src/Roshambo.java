/**
 * Created by D.Cisero on 7/25/17.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    //include a toString method  to convert selected value to a string
    public String toString() {
        switch (this) {
            case ROCK:
                return "ROCK";
            case PAPER:
                return "PAPER";
            default:
                return "SCISSORS!";
        }
    }

}
//}
//    ROCK {
//        public String toString() {
//
//            return "ROCK";
//        }
//
//    },
//    PAPER {
//        public String toString() {
//
//            return "PAPER";
//        }
//
//    },
//    SCISSORS {
//        public String toString() {
//
//            return "SCISSORS";
//        }
//    }

//    public String toString() {
//        return super.toString;
//    }


