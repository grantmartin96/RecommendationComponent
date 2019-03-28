package Business.Recommendation;

public class RecommendationStoreBuilder extends RecommendationStore {

    public Recommendation createRecommendation(String item) {
        if (item.equals("recommendation 1")) {
            return new Recommendation1();
        } else if (item.equals("recommendation 2")) {
            return new Recommendation2();
        } else if (item.equals("recommendation 3")) {
            return new Recommendation3();
        } else return null;
    }
}
