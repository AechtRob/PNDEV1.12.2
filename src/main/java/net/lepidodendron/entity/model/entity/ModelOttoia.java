package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraOttoia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOttoia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer mouth2;

    public ModelOttoia() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 32.0F, 0.0F);
        this.setRotateAngle(tail, -1.5708F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 9, 5, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -8.9F);
        this.tail.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -2.3562F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 11, -1.0F, 0.0F, 8.9F, 2, 0, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -8.9F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 11, -1.0F, 0.0F, 8.9F, 2, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -1.0F, -1.0F, -2.0F, 2, 2, 2, -0.001F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body5.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body4.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body3.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.002F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -1.0F, -1.0F, -2.0F, 2, 2, 2, 0.003F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.95F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 5, -1.0F, -1.0F, -2.05F, 2, 2, 2, 0.05F, false));
        this.head.cubeList.add(new ModelBox(head, -1, 11, -1.5F, 0.0F, -0.95F, 3, 0, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, -1, 10, -1.5F, 0.0F, -2.15F, 3, 0, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.95F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 2.3562F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 0, 0.9F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 0, 0.9F, 0.0F, -1.2F, 1, 0, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -0.95F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -2.3562F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 0, 0.9F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 0, 0.9F, 0.0F, -1.2F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.95F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 0, 0.9F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 0, 0.9F, 0.0F, -1.2F, 1, 0, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.95F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 0, 0.9F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 0, 0.9F, 0.0F, -1.2F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.1F, -2.15F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -1, 11, -2.6F, 0.0F, 1.2F, 3, 0, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, -1, 10, -2.6F, 0.0F, 0.0F, 3, 0, 1, 0.0F, false));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, 0.0F, -2.05F);
        this.head.addChild(mouth);
        this.mouth.cubeList.add(new ModelBox(mouth, 9, 2, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

        this.mouth2 = new AdvancedModelRenderer(this);
        this.mouth2.setRotationPoint(0.0F, 0.0F, -0.9F);
        this.mouth.addChild(mouth2);
        this.mouth2.cubeList.add(new ModelBox(mouth2, 9, 8, -0.5F, -0.5F, -1.1F, 1, 1, 1, 0.05F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.tail.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.tail.offsetZ = -0.04F;
        this.tail.offsetY = -0.43F;
        this.tail.render(0.011F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.tail.offsetY = -6.2F;
        this.tail.offsetX = -2.4F;
        this.tail.offsetZ = 2.0F;
        this.tail.rotateAngleY = (float)Math.toRadians(120);
        this.tail.rotateAngleX = (float)Math.toRadians(1);
        this.tail.rotateAngleZ = (float)Math.toRadians(0);
        this.tail.scaleChildren = true;
        float scaler = 4.2F;
        this.tail.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(tail, 3.2F, 3.8F, -0.2F);
        this.setRotateAngle(body1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.1F, 0.0F, 0.0F);

        //End of pose, now render the model:
        this.tail.render(f);
        //Reset rotations, positions and sizing:
        this.tail.setScale(1.0F, 1.0F, 1.0F);
        this.tail.scaleChildren = false;
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
        float offsetV = 1.0F - 1.5F;
        this.tail.offsetY = offsetV;
        float rotX = (float) Math.toRadians(6);
        this.tail.rotateAngleX = rotX;
        this.tail.offsetZ = 0.2F;

        EntityPrehistoricFloraOttoia ee = (EntityPrehistoricFloraOttoia) e;

        this.bob(mouth, 0.25F, 0.1F, false, f2, 1);

        float speedmodifier = 1;
        float swaymodifier = 1;
        float buried = 1;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fullBody = {this.body5, this.body4, this.body3, this.body2, this.body1, this.head};
        AdvancedModelRenderer[] headBody = {this.body4, this.body3, this.body2, this.body1, this.head};

        float speed = 0.4F;
        float taildegree = 0.3F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        speed = 0.15F * speedmodifier;
        taildegree = 0.12F;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.tail.offsetY = offsetV + -1.0F + 4.5F;
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98);
                this.tail.offsetZ = 0;
                swaymodifier = 0;
                buried = 0;
                //Do some fully-buried wiggle animatins:
                this.chainWave(headBody, speed, -0.55F, 2.5, f2, 0.4F);
                this.chainSwing(headBody, speed, -0.55F, -2.5, f2, 0.4F);
            }
            else {
                this.tail.offsetY = offsetV + (1.5F * (float)((double)ee.getBuriedTick()/60D));
                this.tail.rotateAngleX = rotX - (float) Math.toRadians(98 * ((double)ee.getBuriedTick()/60D));
                this.tail.offsetZ = 0.2F - (float) (0.2 * ((double)ee.getBuriedTick()/60D));
                buried = 0;
            }
        }
        else {
            this.tail.offsetY = offsetV;
            this.tail.rotateAngleX = rotX - (float) Math.toRadians(8);

            this.chainSwing(fullBody, speed, taildegree * buried * 0.7F, -2, f2, 1);
            this.chainWave(headBody, speed, -0.05F * buried * 0.5F, 1, f2, 1);
            this.chainSwing(headBody, speed, -taildegree * buried * 0.7F, -1, f2, 1);

            this.body4.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
            this.body2.walk(speed, -buried * 0.012F, false, 4.5F, -buried * 0.012F, f2, 1F);
        }

        float bobber = 2.5F;

        if (!e.isInWater()) {
            //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
            this.tail.offsetY =- 0.05F - 0.76F - 2.0F;
            bobber = 1.0F;
            this.chainWave(fullBody, speed, 0.2F * 0.2F, -2, f2, 1 * 0.5F);
        }
        else {
            this.chainWave(fullBody, speed, 0.05F * buried, -3, f2, 1);
        }
        this.bob(tail, -speed, bobber, false, f2, 0.2F);

    }
}
