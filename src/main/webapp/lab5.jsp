
<%@page import="TheoryOfAlgorithms.Markichev.Lab5.Lab5_2"%>
<%@page import="TheoryOfAlgorithms.Markichev.Lab5.Lab5_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <%! Lab5_1 lab5_1 = new Lab5_1("A rave (from the verb: to rave) describes a dance "
            + "party at a warehouse, public or private property, typically featuring"
            + " performances by DJs playing electronic dance music. The style is most"
            + " associated with the early 90s dance music scene when DJs played at"
            + " illegal events in musical styles dominated by electronic dance music"
            + " from a wide range of sub-genres, including techno, hardcore, house,"
            + " dubstep, and alternative dance. Occasionally live musicians have been"
            + " known to perform at raves, in addition to other types of performance "
            + "artists such as go-go dancers and fire dancers. The music is amplified"
            + " with a large, powerful sound reinforcement system, typically with large "
            + "subwoofers to produce a deep bass sound. The music is often accompanied"
            + " by laser light shows, projected coloured images, visual effects and"
            + " fog machines. While some raves may be small parties held at nightclubs"
            + " or private homes, some raves have grown to immense size, such as the large"
            + " festivals and events featuring multiple DJs and dance areas (e.g., the"
            + " Castlemorton Common Festival in 1992). Some electronic dance music festivals"
            + " have features of raves, but on a larger, often commercial scale. Raves may"
            + " last for a long time, with some events continuing for twenty-four hours, "
            + "and lasting all through the night. Law enforcement raids and anti-rave laws"
            + " have presented a challenge to the rave scene in many countries. This is due"
            + " to the association of illegal drugs such as MDMA (often referred to as a"
            + " \"club drug\" or \"party drug\" along with MDA), amphetamine, LSD,"
            + " GHB, ketamine, methamphetamine, cocaine, and cannabis. In addition to drugs,"
            + " raves often make use of non-authorized, secret venues, such as squat parties"
            + " at unoccupied homes, unused warehouses, or aircraft hangars. These concerns"
            + " are often attributed to a type of moral panic surrounding rave culture. A "
            + "sense of participation in a group event is among the chief appeals of rave "
            + "music and dancing to pulsating beats is its immediate outlet. Raving in itself"
            + " is a syllabus-free dance, whereby the movements are not predefined and the dance"
            + " is performed randomly, dancers take immediate inspiration from the music, their"
            + " mood and watching other people dancing. Thus, the electronic, rave and club"
            + " dances refer to the street dance styles that evolved alongside electronic music"
            + " culture. Such dances are street dances since they evolved alongside the"
            + " underground rave and club movements, without the intervention of dance studios."
            + " These dances were originated in some 'scenes' around the world, becoming known "
            + "only to ravers or clubgoers who attempt to these locations. They were originated "
            + "at some point that certain moves had begun to be performed to several people at "
            + "those places, creating a completely freestyle, yet still highly complex set of "
            + "moves, adaptable to every dancer change and dance whatever they want based on "
            + "these moves. Many rave dancing techniques suggest using your body as an extension"
            + " of the music, to loosen up, and let the music flow through the body to create "
            + "a unique form of movement.[citation needed] A common feature shared by all these "
            + "dances, along with being originated at clubs, raves and music festivals around "
            + "the world and in different years, is that when YouTube and other social media "
            + "started to become popular (around 2006), these dances began to be popularised by"
            + " videos of raves performing them, recording and uploading their videos.[citation needed]"
            + " Therefore, they began to be practised outside their places of origin, creating different"
            + " 'scenes' in several countries. Furthermore, some of these dances began to evolve, "
            + "and these dance 'scenes' are not totally related to the club/rave scenes they were "
            + "originated. Also, the way of teaching and learning them have changed. In the past, "
            + "if someone wanted to learn one of these dances, the person had to go to a club/rave, "
            + "watch people dancing and try to copy them. Now,[when?] with social media, these dances "
            + "are mostly taught on video tutorials and the culture spreads and grows inside those social "
            + "media, like Flogger on Fotolog, Rebolation, Sensualize and Free Step on Orkut "
            + "and Cutting Shapes on Instagram. Due to the lack of studies dedicated to those dances, "
            + "combined with poor and inaccurate information of them available on the Internet, it is "
            + "hard to find reliable information.");%>
            <p><b>Text:</b> <%= lab5_1.GetText()%></p>
            <form action="./lab5" method="post" class="form-inline">
                <label for="x"><b>Enter word to search for: </b></label>
                <div class="input-group">
                    <input  class="form-control" id="find" type="text" name="find"/>
                    <input class="btn btn-success" type="submit" value="Submit"/>
                </div>
                <p class="mt-3 mb-0"><b>Word number: </b><%=request.getAttribute("result")%></p>
            </form>
            <p><b>Most popular words:</b> <%= lab5_1.GetMostPopularWords()%></p>
            <p><b>Most popular sequences (4):</b>
                <%= lab5_1.MostPopularSequences(4)%></p>
            <%! Lab5_2 lab5_2 = new Lab5_2(20); %>
            <% lab5_2.InitList(); %>
            <p><b>List: </b><br/> <%= lab5_2.DisplayList()%></p>
            <%! String find = "model #14"; %>
            <% lab5_2.SortByStringField();%>
            <p><b>Sorted by string field: </b><br/> <%= lab5_2.DisplayList()%></p>
            <p><b>Index of element with value </b><%= find %>: <%= lab5_2.IndexOf(find)%></p>
            <% lab5_2.SortByByteField();%>
            <p><b>Sorted by byte field: </b><br/> <%= lab5_2.DisplayList()%></p>
    </body>
</html>
