package Business.Recommendation;


public abstract class RecommendationStore {
    public Recommendation makeRecommendation(String type) {
        Recommendation recommendation;

        recommendation = createRecommendation(type);

        recommendation.restaurantName();
        recommendation.distance();
        recommendation.roundTripTime();
        recommendation.currentNumberPeople();


        return recommendation;
    }
     public abstract Recommendation createRecommendation(String type);
}
