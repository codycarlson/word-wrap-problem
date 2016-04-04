import spock.lang.Specification

class WordWrapperImplTest extends Specification{
    def "Test wordWrap"() {
        given:
            WordWrapper wordWrapper = new WordWrapperImpl()
        when:
            List<String> lines = wordWrapper.wrapWords("More than 5", 5)
        then:
            lines.contains("More ")
            lines.contains("than ")
            lines.contains("5")
    }
}
