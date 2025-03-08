package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelEbenaqua extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;

    public ModelEbenaqua() {
        this.textureWidth = 44;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.base.cubeList.add(new ModelBox(base, 29, 28, -1.0F, -11.0F, -5.0F, 2, 4, 3, 0.01F, false));
        this.base.cubeList.add(new ModelBox(base, 10, 4, -1.0F, -10.0F, -5.5F, 2, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -7.1F, -5.5F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, -1.0F, -1.0F, -3.5F, 2, 1, 3, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.575F, -3.5F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6109F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -1.0F, -2.0F, -3.5F, 2, 2, 5, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -8.25F, -5.25F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.6981F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -2.0F, -1.0F, 2, 2, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -9.0F, -2.75F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 11, 10, -1.5F, -4.0F, 0.0F, 3, 8, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0036F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 15, -1.0F, 0.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9163F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 29, -1.0F, -4.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 27, 4, -1.0F, -2.95F, -0.8F, 2, 6, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 7, 15, -0.5F, -0.75F, 2.2F, 1, 2, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 1.55F, 4.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.0F, 0.0F, -3.0F, 0, 7, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 1.05F, 3.5F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 29, 0.0F, 0.0F, -3.0F, 1, 7, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -1.9F, 5.55F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5236F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 17, 1.0F, -7.5F, -3.0F, 0, 8, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.75F, 3.5F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 20, 0.0F, -7.5F, -3.0F, 1, 8, 3, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.3F, 3.15F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 3, -0.5F, -0.25F, -0.4F, 1, 1, 2, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.5F, -0.75F, -0.4F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 3.5F, 5.45F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.829F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 17, 1.0F, -6.0F, -1.0F, 0, 6, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.15F, 1.85F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 13, 0.0F, -1.0F, -1.0F, 1, 1, 5, 0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 5.3F, 2.9F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.6545F, -0.5236F, 0.3491F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 2, 0.0F, -0.5F, -0.3F, 0, 1, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 5.3F, 2.9F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.6545F, 0.5236F, -0.3491F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 2, 0.0F, -0.5F, -0.3F, 0, 1, 1, 0.0F, true));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, -6.5F, -3.9F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, -0.5236F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, -6.5F, -3.9F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.5236F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 0, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -7.7F, -6.5F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.2618F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 0, -1.0F, -0.75F, -2.0F, 2, 1, 3, -0.02F, false));


        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }

    public void renderStaticWall(float f) {
        this.base.offsetY = -0.15F;
        this.base.offsetX = -0.25F;
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.2F, 0.0F, 0.1F);
        this.setRotateAngle(jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.base.offsetZ = -0.01F;
        this.base.offsetX = -0.12F;
        this.base.offsetY = 0.35F;
        this.base.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -1.5F;
        this.base.offsetX = -0F;
        this.base.rotateAngleY = (float)Math.toRadians(220);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 2.2F;
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
        this.base.offsetY = -0.1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.1F, -1.5, f2, 1);
            this.swing(base, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.5F, false, 0, 0.4F, f2, 1);
            this.flap(pelvicfinright, speed * 1.5F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(pelvicfinleft, speed * 1.5F, -0.75F, false, 0F, 0.3F, f2, 1F);
            this.flap(pectoralfinright, speed * 1.5F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(pectoralfinleft, speed * 1.5F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(pectoralfinright, speed * 1.5F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(pectoralfinleft, speed * 1.5F, -0.65F, false, 0F, 0.2F, f2, 1F);
            if (!e.isInWater()) {
                this.base.rotateAngleZ = (float) Math.toRadians(90);
                this.base.offsetX = -0.5F;
                this.bob(base, -speed, 5F, false, f2, 1);
            }
        }
    }
}
