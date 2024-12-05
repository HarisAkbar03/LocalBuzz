// Handle tab switching
function openTab(event, tabId) {
    // Hide all tab content
    const tabContents = document.querySelectorAll('.tab-content');
    tabContents.forEach(content => content.classList.remove('active'));

    // Remove active class from all buttons
    const tabButtons = document.querySelectorAll('.tab-btn');
    tabButtons.forEach(button => button.classList.remove('active'));

    // Show the selected tab content
    document.getElementById(tabId).classList.add('active');

    // Highlight the selected button
    event.currentTarget.classList.add('active');
}

// Default: Open the first tab
document.addEventListener('DOMContentLoaded', () => {
    document.querySelector('.tab-btn').click();
});
