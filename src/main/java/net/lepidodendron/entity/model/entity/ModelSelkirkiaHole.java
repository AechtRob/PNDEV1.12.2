package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;

public class ModelSelkirkiaHole extends AdvancedModelBase {
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;

    public float scaler;

    public ModelSelkirkiaHole() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 25.8821F, 0.0F);
        setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 8, -0.5F, 0.0F, -0.497F, 1, 2, 1, 0.002F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.25F, -3.0F, -0.75F, 1, 3, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.75F, -3.0F, -0.75F, 1, 3, 1, 0.002F, false));
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.75F, -3.0F, -0.25F, 1, 3, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.25F, -3.0F, -0.25F, 1, 3, 1, 0.002F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.75F, -3.0F, -0.75F, 1, 3, 1, 0.006F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.25F, -3.0F, -0.75F, 1, 3, 1, 0.004F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.25F, -3.0F, -0.25F, 1, 3, 1, 0.006F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.75F, -3.0F, -0.25F, 1, 3, 1, 0.004F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -2.8654F, -0.0022F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.75F, -1.0346F, -0.7478F, 1, 1, 1, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.25F, -1.0346F, -0.7478F, 1, 1, 1, 0.048F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.25F, -1.0346F, -0.2478F, 1, 1, 1, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.75F, -1.0346F, -0.2478F, 1, 1, 1, 0.048F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -1.5846F, -0.4978F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.5708F, 1.1781F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, 0.0546F, -0.2642F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -1.1781F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, 0.0546F, -0.2642F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 12, 0.0546F, -0.2642F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.25F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -3.1416F, 0.0F, -2.7489F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 2.7761F, -0.7119F, -2.6117F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3655F, -0.7119F, -0.5299F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4887F, -0.0008F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3655F, 0.7119F, -0.5299F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 12, 0.2856F, -0.1685F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7071F, -0.4346F, -0.7049F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -2.7761F, 0.7119F, -2.6117F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -0.6F, -0.6F, 0.0F, 1, 1, 0, 0.0F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        //System.err.println(hidden);

        this.tail.offsetY = 1.95F;

        AdvancedModelRenderer[] bodyFull = {this.body1, this.body2, this.head};
        float speed = 0.091F;
        if (this.scaler > 0.1F) {
            this.chainWave(bodyFull, speed / scaler, 0.08F, 2, f, 0.42F);
            this.chainFlap(bodyFull, speed / scaler, 0.08F, 2, f, 0.42F);
            float floatSwing = 0.5F;
            float floatFlap = 0.1F;

        }
        this.tail.render(0.019f);

    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
