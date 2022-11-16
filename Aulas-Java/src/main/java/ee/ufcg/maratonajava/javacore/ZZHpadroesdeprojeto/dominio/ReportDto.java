package ee.ufcg.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personName;


    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.country = this.country;
            reportDto.personName = this.personName;
            reportDto.aircraftName = this.aircraftName;
            reportDto.currency = this.currency;
            return reportDto;
        }
    }
}