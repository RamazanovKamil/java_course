package tatar.companiese.kamil.java2025.oop_topics;

public class FinalAndSealedClasses {
}
//Финайльный класс:
final class ClassA {}

//Закрытый класс:
sealed abstract class BusinessReport
permits SalesBusinessReport, MarketingBusinessReport, SupportingBusinessReport {}

final class SalesBusinessReport extends BusinessReport {}
final class MarketingBusinessReport extends BusinessReport {}
non-sealed class SupportingBusinessReport extends BusinessReport {}
class TechSupport extends SupportingBusinessReport {}

//Такой класс не может существовать без модификаторов sealed, non-sealed or final и он должен быть добавлен в список разрешенных для унаследования классов:
//class EmployeePerformanceReport extends BusinessReport {}