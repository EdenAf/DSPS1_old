package Classes;

import java.util.List;

// {"title":"Where Is Baby's Belly Button? A Lift-the-Flap Book",
// "reviews":[
//      {"id":"R14D3WP6J91DCU","link":"https://www.amazon.com/gp/customer-reviews/R14D3WP6J91DCU/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Five Stars","text":"Super cute book. My son loves lifting the flaps.","rating":5,"author":"Nikki J","date":"2017-05-01T21:00:00.000Z"},
//      {"id":"R1RUXYHCSZSHJ0","link":"https://www.amazon.com/gp/customer-reviews/R1RUXYHCSZSHJ0/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Cute Book","text":"Cute lift-the-flap book. My 9 month old loves it!","rating":5,"author":"Katie","date":"2017-04-19T21:00:00.000Z"},
//      {"id":"R367OTNJ8I36FS","link":"https://www.amazon.com/gp/customer-reviews/R367OTNJ8I36FS/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"... this except that it was a gift for a great granddaughter. My granddaughter tells me that she reads ...","text":"I can't say much about this except that it was a gift for a great granddaughter.  My granddaughter tells me that she reads this to her eighteen month old daughter, and they both enjoy it enough to share it over and over again.  I read it too and found it a fun story.","rating":5,"author":"emmarq","date":"2014-07-08T21:00:00.000Z"},
//      {"id":"RJ62XWHGDIF7","link":"https://www.amazon.com/gp/customer-reviews/RJ62XWHGDIF7/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"My son loves it","text":"As soon as I got this package, I gave it to my 18 month old son to open and he made me read it to him about a dozen times. He loves it! He's obsessed with his belly button, so this is the perfect book for him. He's also obsessed with peek-a-boo, so he loves lifting the flaps. It was a definite hit!","rating":5,"author":"Princess","date":"2016-02-03T22:00:00.000Z"},
//      {"id":"R1L8O7RM8DD6J3","link":"https://www.amazon.com/gp/customer-reviews/R1L8O7RM8DD6J3/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"1 year old never tires of this flap book.","text":"The book is sturdy and well made. My baby likes to carry her books around and they are routinely dropped. It has held up really well. She loves the flaps and finding the hands, feet, etc. My only critique is that the body parts that are highlighted are the smallest item on the whole page. As a visual representation for teaching a child it seems weird that the focal points are not scaled to be more familiarly identifiable.","rating":4,"author":"reviewer","date":"2016-04-28T21:00:00.000Z"},{"id":"RGMH5ROASTBS8","link":"https://www.amazon.com/gp/customer-reviews/RGMH5ROASTBS8/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Five Stars","text":"Well-made children's book that an child will love.","rating":5,"author":"Andrea Gates","date":"2017-02-10T22:00:00.000Z"},{"id":"RW6ORU2M3C461","link":"https://www.amazon.com/gp/customer-reviews/RW6ORU2M3C461/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Great book for babes and toddlers","text":"I bought this book for a newborn. She loved when our parents read to her as an infant. She's now almost two and loves playing with it herself. I got it based on the positive reviews. I'm so glad I did. Will buy it again and highly recommend","rating":5,"author":"Sjm","date":"2017-06-16T21:00:00.000Z"},{"id":"R3R9QKZ61DMKGF","link":"https://www.amazon.com/gp/customer-reviews/R3R9QKZ61DMKGF/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Where Is Baby's Belly Button","text":"This gift was liked by the child and parents.","rating":5,"author":"David F. Daniels","date":"2017-05-29T21:00:00.000Z"},{"id":"R3GCFAIUL8BI3Y","link":"https://www.amazon.com/gp/customer-reviews/R3GCFAIUL8BI3Y/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Five Stars","text":"This book is adorable. My toddler loves it.","rating":5,"author":"Rebecca","date":"2017-04-11T21:00:00.000Z"},{"id":"R1IKZK5S0DCKZ0","link":"https://www.amazon.com/gp/customer-reviews/R1IKZK5S0DCKZ0/ref=cm_cr_arp_d_rvw_ttl?ie=UTF8&ASIN=0689835604","title":"Super cute!","text":"My daughter loves lifting the flaps herself! She's almost a year. Great colorful pictures. I'm never disappointed with Karen Katz!","rating":5,"author":"Jacobandem","date":"2016-06-11T21:00:00.000Z"}
//      ]
//  }
public class ReviewsBatch {
    private String title;
    private List<Review> reviews;

    public ReviewsBatch(String title, List<Review> reviews) {
        this.title = title;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
