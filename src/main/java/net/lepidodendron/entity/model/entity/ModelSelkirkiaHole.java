package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSelkirkiaHole;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSelkirkiaHole extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r4;

    public float scaler;

    public ModelSelkirkiaHole() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 24.6321F, 0.003F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 6, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.002F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 5, 3, -0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 3, -0.5F, -1.0F, -0.5F, 1, 1, 1, -0.002F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.8654F, -0.0022F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 5, 0, -0.5F, -1.0346F, -0.4978F, 1, 1, 1, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, -1.5846F, -0.4978F, 1, 1, 1, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.5F, -2.2014F, -0.5035F);
        this.head.addChild(bone);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.3525F, 1.02F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 7, -1.0F, 0.6457F, -0.3586F, 1, 1, 0, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.5F, -2.2014F, -0.5035F);
        this.head.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -1.5708F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.3525F, 1.02F);
        this.bone2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 5, 7, 0.0F, 0.6457F, -0.3586F, 1, 1, 0, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.5F, -2.2014F, -0.5035F);
        this.head.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, 3.1416F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.3525F, 1.02F);
        this.bone3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 5, 7, 0.0F, 0.263F, -1.2825F, 1, 1, 0, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.5F, -2.2014F, -0.5035F);
        this.head.addChild(bone4);
        this.setRotateAngle(bone4, 0.0F, 1.5708F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.3525F, 1.02F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 7, -1.0F, 0.263F, -1.2825F, 1, 1, 0, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tail.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();

        //System.err.println(hidden);

        this.bone.offsetY = 1.95F;

        AdvancedModelRenderer[] bodyFull = {this.tail, this.body2, this.body1, this.head};
        float speed = 0.091F;
        if (this.scaler > 0.1F) {
            this.chainWave(bodyFull, speed / scaler, 0.08F, 2, f, 0.42F);
            this.chainFlap(bodyFull, speed / scaler, 0.08F, 2, f, 0.42F);

        }
        this.tail.render(0.019f);

    }

    public void setRotateAngle(AdvancedModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
