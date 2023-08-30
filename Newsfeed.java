public class Newsfeed {

	String [] trendingArticles;
	int[] views;
	double[] ratings;

	public Newsfeed(String[] initialArticles, int[] initialViews, double [] initialRatings){

		trendingArticles = initialArticles;
        	views = initialViews;
        	ratings = initialRatings;
	
		}

   	 public String getTopArticle(){
   	     return trendingArticles[0];

		}

	public void viewArticle(int articleNumber){

		views[articleNumber] = views[articleNumber] + 1 ;

		System.out.println("El articulo '" + trendingArticles[articleNumber] + "' ha sido visto " + views[articleNumber] + " veces");

		}

	public void changeRating(int articleNumber, double newRating){

		if (newRating > 5 || newRating < 0) {
			
			System.out.println("El rating del articulo '" + trendingArticles[articleNumber] + "' esta entre 0 y 5 estrellas");

		} else {

			ratings[articleNumber] = newRating;
			System.out.println("El articulo '" + trendingArticles[articleNumber] + " es ahora visto " + ratings[articleNumber] + " estrellas");

		}

		}

	public static void main(String[] args){

		String[] robotArticles = {"Oil news", "Innovative Motors" , "Humans: Exterminate or not?" , "Organic Eye IMplants" , "Path finding an Unknown world" };
		int[] robotViewers = {87 , 32 , 13 , 11 , 7 };
		double[] robotRatings = {2.5 , 3.2 , 5.0 , 1.7 , 4.3};

		Newsfeed robotTimes = new Newsfeed(robotArticles , robotViewers , robotRatings);

		robotTimes.viewArticle(5);
		robotTimes.viewArticle(2);

		System.out.println("El articulo top es " + robotTimes.getTopArticle());

		robotTimes.changeRating( 3 , 5 );

		}
}
