import spock.lang.Specification

class WordWrapperImplTest extends Specification{
    def "Insert meaningful test name here"() {
        given:
            //set up a thing
            def wrapper = new WordWrapperImpl();
            def testString = "The Quick Brown Fox Jumps Over The Lazy Dog";
        when:
            //we do a thing
            def LineList = wrapper.wrapWords(testString, 8);
        then:
//            LineList == testString.split(" ");
            LineList == ["The", "Quick", "Brown", "Fox", "Jumps", "Over The", "Lazy Dog"];
            true
            //the thing that we thought would happen, happened
    }
}
