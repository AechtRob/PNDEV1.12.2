package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSacabambaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer mouth_r1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;

    public ModelSacabambaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 14, 34, -1.99F, -5.75F, -7.0F, 4, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 38, 26, -2.5F, -7.0F, 6.25F, 5, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 11, -3.0F, -6.5F, -3.75F, 6, 2, 10, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 23, -3.5F, -4.85F, -2.75F, 7, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 36, -3.51F, -4.35F, -4.1F, 7, 3, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 5, -3.01F, -4.35F, -6.1F, 6, 3, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 11, -3.49F, -5.451F, 0.85F, 7, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 38, -2.99F, -5.451F, 5.85F, 6, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 40, -2.49F, -6.7F, -4.3F, 5, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 17, -2.5F, -7.0F, -5.75F, 5, 2, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 22, -2.49F, -2.75F, 6.0F, 5, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 0, -2.99F, -3.65F, 3.5F, 6, 2, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 31, -2.99F, -4.6F, 1.5F, 6, 3, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 5, -3.8F, -5.25F, -3.45F, 2, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 38, 1.8F, -5.25F, -3.45F, 2, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 11, -4.71F, -5.4F, -5.55F, 1, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 16, 3.71F, -5.4F, -5.55F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 30, 2.5F, -6.65F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, -0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 17, -4.5F, -6.65F, -5.0F, 2, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -3.5F, -6.75F, -3.4F, 7, 1, 10, 0.0F, false));

        this.mouth_r1 = new AdvancedModelRenderer(this);
        this.mouth_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(mouth_r1);
        this.setRotateAngle(mouth_r1, 0.3491F, 0.0F, 0.0F);
        this.mouth_r1.cubeList.add(new ModelBox(mouth_r1, 39, 0, -1.99F, -6.85F, -5.0F, 4, 2, 1, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.0F, 8.0F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 22, 23, -2.0F, -2.01F, 0.25F, 4, 4, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 4.25F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 22, 38, -1.5F, -1.25F, 0.0F, 3, 3, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -1.26F, 0.0F, 2, 3, 3, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 6, 30, -0.5F, -1.0F, 0.0F, 1, 2, 6, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 24, 0.0F, -3.5F, 0.0F, 0, 6, 6, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 6.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 31, -0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 2, 0.0F, -1.5F, 6.0F, 0, 3, 4, 0.0F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        this.head.render(f5 * 0.25F);

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.head.offsetY = 1.2F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.tail1, this.tail2};
        float speed = 0.6F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -3, f2, 0.8F);
            this.swing(head, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 1.0F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
