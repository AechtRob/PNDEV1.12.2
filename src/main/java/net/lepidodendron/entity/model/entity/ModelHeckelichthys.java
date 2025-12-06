package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHeckelichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer jaw;

    public ModelHeckelichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 1.0F);
        this.body.cubeList.add(new ModelBox(body, 6, 30, -1.0F, -3.5F, -8.0F, 2, 3, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 8, -1.0F, -2.55F, -10.7F, 2, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 24, -1.0F, -4.0F, -6.0F, 2, 3, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 34, 20, -1.0F, -3.0F, -9.1F, 2, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -3.1F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 26, -1.0F, -1.0F, -3.0F, 2, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.6F, -6.825F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 4, -1.0F, -1.0F, -3.0F, 2, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.575F, -10.675F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9163F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 34, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -3.725F, -7.95F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4014F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -1.0F, 0.0F, -3.0F, 2, 1, 3, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 30, -1.0F, 0.0F, -2.0F, 2, 1, 2, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, -0.9F, -6.5F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.5236F, 0.0F, 0.4363F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 30, 33, 0.0F, -0.6F, -0.5F, 0, 4, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, -0.9F, -6.5F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.5236F, 0.0F, -0.4363F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 30, 33, 0.0F, -0.6F, -0.5F, 0, 4, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, -3.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -2.0F, 0.0F, 2, 4, 6, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 10, -1.0F, -1.4F, -0.5F, 2, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.95F, 0.5F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.048F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 14, -1.0F, -1.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.95F, 0.5F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0305F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 8, -1.0F, -1.0F, -1.0F, 2, 1, 5, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.6F, 2.5F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.48F, 0.0F, 0.5236F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 26, 34, 0.0F, -0.6F, 0.0F, 0, 2, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.6F, 2.5F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.48F, 0.0F, -0.5236F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 26, 34, 0.0F, -0.6F, 0.0F, 0, 2, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 1.0F, 4.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 16, 0, -0.75F, -2.0F, -1.0F, 1, 2, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 16, 0, -0.25F, -2.0F, -1.0F, 1, 2, 6, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.725F, 1.75F, 0.0F);
        this.body4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 25, -1.0F, -2.0F, -1.0F, 1, 1, 4, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 25, -1.45F, -2.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7F, 2.2F, 0.275F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 34, -1.0F, -2.0F, 3.0F, 1, 1, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 34, -1.4F, -2.0F, 3.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.725F, -0.65F, -0.2F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1222F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 18, -1.0F, -2.0F, -1.0F, 1, 1, 6, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 18, -1.45F, -2.0F, -1.0F, 1, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.625F, 1.525F);
        this.body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.288F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 20, 0.0F, 0.0F, 0.0F, 0, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.4F, 0.125F);
        this.body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 30, 0.0F, -5.0F, 0.0F, 0, 5, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -1.05F, 4.975F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 22, 30, -0.5F, -0.6F, -1.1F, 1, 1, 3, 0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 10, 0.0F, -4.1F, 1.8F, 0, 9, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.25F, 0.025F, -0.2F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1047F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 26, -1.75F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.25F, 0.925F, -0.05F);
        this.body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 30, -1.75F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.025F, -9.725F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 22, -0.75F, -0.75F, -1.0F, 1, 1, 1, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 24, -0.75F, -0.75F, -1.375F, 1, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 24, -0.25F, -0.75F, -1.375F, 1, 1, 1, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 22, -0.25F, -0.75F, -1.0F, 1, 1, 1, 0.01F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.05F;
        this.body.offsetY = -0.23F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = 0.3F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 2.2F;
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

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(pelvicfinright, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
//                this.body.offsetY = -0.25F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
