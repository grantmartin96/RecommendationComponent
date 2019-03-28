package Business.Recommendation;

public class RecommendationTestDrive {
    private static Object Recommendation;

    public static void main(String[]args){

        RecommendationStore recommendationStoreBuilder = new RecommendationStoreBuilder();

        Recommendation = recommendationStoreBuilder.makeRecommendation("recommendation 1");

        Recommendation = recommendationStoreBuilder.makeRecommendation("recommendation 2");

        Recommendation = recommendationStoreBuilder.makeRecommendation("recommendation 3");

    }
}
