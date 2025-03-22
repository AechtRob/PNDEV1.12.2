package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDorypterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pelvecfinright;
    private final AdvancedModelRenderer pelvecfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;


    public ModelDorypterus() {
        this.textureWidth = 39;
        this.textureHeight = 36;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 17.35F, -6.95F);
        this.base.cubeList.add(new ModelBox(base, 28, 0, -1.5F, -0.55F, 1.95F, 3, 5, 2, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 26, 17, -1.5F, 0.4F, 0.925F, 3, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.875F, 0.5F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, -1.5F, -1.0F, 0.0F, 3, 3, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.3F, 1.45F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -1.5F, -2.0F, -3.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 5.975F, 5.3F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 13, -0.5F, -1.0F, -3.0F, 2, 1, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 5.425F, 3.95F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 0, -0.5F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.55F, 3.95F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.0F, -11.3F, 0.4F, 0, 8, 11, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.35F, -0.5F, 3, 6, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.8F, 0.65F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -1.0F, -2.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.35F, 3.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 18, 15, -1.0F, -2.15F, -0.5F, 2, 4, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -5.05F, 0.1F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 6, 0.99F, 1.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -3.75F, -0.25F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 7, -1.0F, 0.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, 5.5F, 0.75F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 3, 1.0F, -2.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5672F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 23, -1.0F, -2.0F, 0.0F, 2, 2, 4, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.65F, 3.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 19, -0.75F, -1.5F, -0.25F, 1, 2, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 19, -0.25F, -1.5F, -0.25F, 1, 2, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.0F, 1.15F, 1.7F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, 1.99F, -1.0F, -3.0F, 0, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.5F, 1.75F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 28, 0.0F, -2.0F, -3.0F, 1, 2, 3, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.0F, -1.775F, 2.15F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3927F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 3.0F, 0.0F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -1.5F, 1.75F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 29, 0.0F, 0.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 1.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 8, 25, -0.5F, -0.5F, -0.25F, 1, 1, 2, -0.01F, false));
        this.body4.cubeList.add(new ModelBox(body4, 14, 19, 0.0F, -3.75F, 1.0F, 0, 7, 4, 0.0F, false));

        this.pelvecfinright = new AdvancedModelRenderer(this);
        this.pelvecfinright.setRotationPoint(-1.0F, 4.425F, 2.1F);
        this.base.addChild(pelvecfinright);
        this.setRotateAngle(pelvecfinright, 0.6981F, -0.3054F, 0.0F);
        this.pelvecfinright.cubeList.add(new ModelBox(pelvecfinright, 0, 18, 0.0F, -0.5F, -0.25F, 0, 3, 1, 0.0F, false));

        this.pelvecfinleft = new AdvancedModelRenderer(this);
        this.pelvecfinleft.setRotationPoint(1.0F, 4.425F, 2.1F);
        this.base.addChild(pelvecfinleft);
        this.setRotateAngle(pelvecfinleft, 0.6981F, 0.3054F, 0.0F);
        this.pelvecfinleft.cubeList.add(new ModelBox(pelvecfinleft, 0, 18, 0.0F, -0.5F, -0.25F, 0, 3, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 3.375F, 1.7F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.3927F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.0F, -0.1F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 13, -0.5F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.5F, 2.3F, 3.775F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.4363F, -0.3927F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 16, 6, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.5F, 2.3F, 3.775F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.4363F, 0.3927F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 16, 6, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.offsetX = -0.1F;
        this.base.offsetY = -0.15F;
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(body2, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.05F, 0.0F);
        this.base.offsetX = 0.010F;
        this.base.offsetY = -0.0F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.0F;
        this.base.offsetX = -1.338F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

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
        //this.Dorypterus.offsetY = 1.35F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.6F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.1F, -1.5, f2, 1);
            this.swing(base, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.35), 0.5F, true, 0, 0, f2, 1);

            this.flap(pelvecfinright, speed * 1.5F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvecfinleft, speed * 1.5F, -0.75F, false, 0F, 0.3F, f2, 1F);
            this.flap(pectoralfinright, speed * 1.5F, 0.1F, false, 0F, -0.1F, f2, 1F);
            this.flap(pectoralfinleft, speed * 1.5F, -0.1F, false, 0F, 0.1F, f2, 1F);
            this.swing(pectoralfinright, speed * 1.5F, 0.3F, false, 0F, -0.2F, f2, 1F);
            this.swing(pectoralfinleft, speed * 1.5F, -0.3F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.base.rotateAngleZ = (float) Math.toRadians(90);
                //this.base.offsetY = 0.05F;
                this.bob(base, -speed, 5F, false, f2, 1);
            }
        }
    }
}
