package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEurynotus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;

    public ModelEurynotus() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 26, 0, -1.0F, -8.0F, -6.75F, 2, 2, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 16, 10, -1.0F, -6.0F, -4.75F, 2, 1, 1, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.975F, -6.575F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, -1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.575F, -6.4F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6545F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 31, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.0F, -6.75F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 24, -1.0F, -2.0F, -1.0F, 2, 2, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.025F, -7.5F, -6.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.6F, -5.25F, -4.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1309F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 30, -1.0F, -4.0F, -1.0F, 1, 4, 2, 0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -6.0F, -6.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 17, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.025F, -7.5F, -6.75F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -6.0F, -6.75F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 17, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.6F, -5.25F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 30, 0.0F, -4.0F, -1.0F, 1, 4, 2, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -7.0F, -3.75F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 11, 12, -1.5F, -3.0F, 0.0F, 3, 5, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 2.0F, -0.25F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -2.0F, -2.0F, 0.0F, 3, 2, 5, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -3.0F, -0.25F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 10, -2.0F, 0.0F, 0.0F, 3, 2, 5, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 9, 22, -1.0F, -2.25F, -0.75F, 2, 4, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, 0.0F, -7.25F, -0.75F, 0, 5, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 34, 0.0F, -7.25F, 4.25F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.7F, 4.55F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 17, -1.0F, -2.0F, -5.0F, 2, 2, 5, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.8F, 3.65F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5411F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 0, -1.0F, 0.0F, -5.0F, 2, 4, 6, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 2.45F, 0.55F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.9163F, -0.0873F, 0.3054F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 22, 8, 0.0F, -0.25F, -0.25F, 0, 4, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 2.45F, 0.55F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.9163F, 0.0873F, -0.3054F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 22, 8, 0.0F, -0.25F, -0.25F, 0, 4, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.3F, 4.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 21, 0.0F, -6.95F, 0.0F, 0, 7, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 0.15F, -0.2F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.48F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 28, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 3.85F, 3.55F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9163F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 20, 1.0F, -4.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.75F, 0.8F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 24, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.15F, 2.3F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 9, 31, -0.5F, -0.85F, -0.25F, 1, 2, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.225F, 3.7F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6109F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 24, 0.0F, -1.0F, 0.0F, 1, 1, 5, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 5.55F, 1.85F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 0, 1.0F, -9.0F, 0.0F, 0, 9, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.15F, 1.75F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 24, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.5F, -5.5F, -3.7F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.829F, -0.2618F, 0.0F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 0.5F, 1.0F);
        this.pectoralfinright.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 15, 1.0F, -2.0F, -1.0F, 0, 2, 7, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.5F, -5.5F, -3.7F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.829F, 0.2618F, 0.0F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.0F, 0.5F, 1.0F);
        this.pectoralfinleft.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 15, -1.0F, -2.0F, -1.0F, 0, 2, 7, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.1F, -4.975F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 30, -1.0F, 0.0F, -2.6F, 2, 1, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -2.0F;
        this.head.offsetX = -1.338F;
        this.head.rotateAngleY = (float)Math.toRadians(200);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 1.63F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.offsetX = -0.03F;
        this.head.offsetY = -0.18F;
        this.head.offsetZ = -0.35F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.00F);
        this.setRotateAngle(body, 0.0F, 0.05F, 0.00F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.00F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.00F);
        this.setRotateAngle(body4, 0.0F, 0.3F, 0.00F);
        this.head.offsetY = -0.0F;
        this.head.offsetZ = -0.0F;
        this.head.render(0.01F);
        resetToDefaultPose();
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pectoralfinright, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(head, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.head.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = -0.1F;
                 this.head.offsetX = -0.5F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
