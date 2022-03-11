import {html} from 'lit';
import {customElement, state} from 'lit/decorators.js';
import {View} from '../../views/view';
import '@vaadin/vaadin-grid/vaadin-grid'
import {getAllTodoItems} from 'Frontend/generated/TodoEndpoint';
import TodoItem from 'Frontend/generated/com/anderscore/samples/data/TodoItem';

@customElement('todos-view')
export class TodosView extends View {

  @state()
  items: TodoItem[] = [];

  render() {
    return html`<h1>Todo-Liste</h1>
      <vaadin-grid class="grid" theme="column-borders" .items="${this.items}">
        <vaadin-grid-column path="name" header="Name" resizable></vaadin-grid-column>
        <vaadin-grid-column path="due" header="Due"></vaadin-grid-column>
        <vaadin-grid-column path="done" header="Done"></vaadin-grid-column>
      </vaadin-grid>
    `;
  }

  async firstUpdated() {
    this.items = await getAllTodoItems();
  }

  connectedCallback() {
    super.connectedCallback();
    this.classList.add(
      'flex',
      'flex-col',
      'h-full',
      'items-center',
      'justify-center',
      'p-l',
      'text-center',
      'box-border'
    );
  }
}
