package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMuhichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jaw;

    public ModelMuhichthys() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 20.0F, -6.0F);
        this.body.cubeList.add(new ModelBox(body, 24, 28, -1.025F, -3.4F, 0.15F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 24, 28, 0.025F, -3.4F, 0.15F, 1, 1, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 10, 0, -1.0F, -3.55F, 2.4F, 2, 4, 3, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.3F, 3.6F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 2.3998F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 21, -0.01F, -0.25F, -1.0F, 0, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.3F, 3.6F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 3.0543F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -1.0F, -3.0F, -2.0F, 2, 3, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.475F, 1.8F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -2.714F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 19, -1.0F, -3.0F, -2.0F, 2, 3, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.1F, 0.35F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -2.4086F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 24, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -3.125F, -0.95F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -2.5002F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 16, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.25F, -1.425F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -2.0595F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 5, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.45F, -0.525F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -1.1083F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 7, -1.0F, -3.0F, -2.0F, 2, 3, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.1F, 6.3F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 21, -1.0F, -2.0F, -3.0F, 2, 2, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.75F, 3.5F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 14, -1.0F, -2.0F, -3.0F, 2, 2, 3, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.225F, 0.45F, 3.9F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 7, 0.0F, -4.0F, -3.0F, 1, 4, 3, 0.02F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.225F, 0.45F, 3.9F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.0873F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 7, -1.0F, -4.0F, -3.0F, 1, 4, 3, 0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.2F, 1.175F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 12, -1.0F, -2.075F, -1.8F, 2, 2, 2, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, -0.3F, 4.175F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3054F, -0.48F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 28, 15, 0.0F, -1.5F, 0.0F, 0, 2, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, -0.3F, 4.175F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3054F, 0.48F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 28, 15, 0.0F, -1.5F, 0.0F, 0, 2, 2, 0.0F, true));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.25F, 4.775F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.3491F, -0.3054F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 28, 23, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.25F, 4.775F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.3491F, 0.3054F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 28, 23, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.8F, 5.425F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.75F, -1.5F, -0.75F, 1, 5, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.25F, -1.5F, -0.75F, 1, 5, 4, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.275F, 5.675F, 0.8F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 5, 0.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 5, -0.45F, -3.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.3F, 4.875F, 3.1F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6109F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 9, 0.0F, -2.0F, -1.0F, 1, 1, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 9, -0.4F, -2.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.3F, -0.05F, 0.525F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 25, 0.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 25, -0.4F, -3.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.275F, -0.2F, 0.2F);
        this.body2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2094F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 24, 0.0F, -3.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 24, -0.45F, -3.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -3.6F, -0.625F);
        this.body2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 2.5133F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 9, 0.0F, -1.25F, -4.8F, 0, 3, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 3.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 26, 19, -0.5F, -0.8F, -0.8F, 1, 2, 2, 0.02F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 28, -0.5F, -0.8F, 0.2F, 1, 1, 2, 0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 6, 28, 0.0F, -2.125F, 1.375F, 0, 4, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 22, 28, 0.0F, -2.625F, 3.375F, 0, 5, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 28, 12, -0.5F, -0.3F, 0.2F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 2.925F, 1.4F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.0472F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 19, -1.0F, -3.0F, -1.0F, 1, 2, 3, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 0.325F, -0.6F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6109F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 28, 0, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.525F, 4.175F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 24, 0.0F, -1.25F, -4.8F, 0, 3, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.35F, 1.1F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 17, -1.0F, -0.5F, -3.0F, 2, 1, 3, -0.01F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = 0.4F;
        this.body.offsetX = -0.2F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 3.4F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.125F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(270);
                this.body.offsetX = 0.50F;
                 this.body.offsetY = -0.10F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
