from flask import Flask, jsonify, request

app = Flask(__name__)

items = [
    {"id": 1, "name": "item", "des": "this is item 1"},
    {"id": 2, "name": "item", "des": "this is item 2"}
]

@app.route('/')
def home():
    return "Welcome to the sample to-do list app"

@app.route('/items', methods=['GET'])
def get_items():
    return jsonify(items)

@app.route('/items/<int:item_id>', methods=['GET'])
def get_item(item_id):
    item = next((item for item in items if item["id"] == item_id), None)
    if item is None:
        return jsonify({"error": "item not found"}), 404
    return jsonify(item)

@app.route('/items', methods=['POST'])
def create_item():
    if not request.json or not 'name' in request.json:
        return jsonify({"error": "Invalid input"}), 400
    
    new_item = {
        "id": items[-1]["id"] + 1 if items else 1,
        "name": request.json['name'],
        "des": request.json.get('des', "")
    }
    items.append(new_item)
    return jsonify(new_item), 201

@app.route('/items/<int:item_id>', methods=['PUT'])
def update_item(item_id):
    item = next((item for item in items if item["id"] == item_id), None)
    if item is None:
        return jsonify({"error": "item not found"}), 404
    
    item['name'] = request.json.get('name', item['name'])
    item['des'] = request.json.get('des', item['des'])
    return jsonify(item)

@app.route('/items/<int:item_id>', methods=['DELETE'])
def delete_item(item_id):
    global items
    items = [item for item in items if item["id"] != item_id]
    return jsonify({"result": "item deleted"}), 200

if __name__ == '__main__':
    app.run(debug=True)
