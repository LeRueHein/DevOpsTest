function extractSourceAndTargetFromText(contentText) {
    if (!contentText || typeof contentText !== "string") {
        return { sourceText: null, targetText: null };
    }

    const cleanedText = contentText.replace(/<\/?[^>]+(>|$)/g, "").trim();
    const sourceMatch = cleanedText.match(/Source\s*:\s*(.+?)(?=\s*Cible\s*:)/);
    const sourceText = sourceMatch ? sourceMatch[1].trim() : null;

    const targetMatch = cleanedText.match(/Cible\s*:\s*(.+)$/);
    const targetText = targetMatch ? targetMatch[1].trim() : null;

    return { sourceText, targetText };
}

module.exports = {
  extractSourceAndTargetFromText
};
