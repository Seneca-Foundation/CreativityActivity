public interface ITrivia {
    public string AskQuestions();

    public List<Pair<Integer, String>> GetAnswers();

    public bool CheckAnswers(int answerSelected);
    
}
