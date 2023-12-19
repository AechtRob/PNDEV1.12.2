package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelVarialepis extends AdvancedModelBase {
    private final AdvancedModelRenderer varialepis;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightpectoral;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftpectoral;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer eye;

    public ModelVarialepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.varialepis = new AdvancedModelRenderer(this);
        this.varialepis.setRotationPoint(0.5F, 24.125F, -0.125F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -8.6F, -3.25F);
        this.varialepis.addChild(body);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 5.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0654F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 7, -2.0F, -1.9F, 0.075F, 3, 2, 6, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0698F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -2.5F, -0.1F, -0.2F, 4, 5, 6, -0.01F, false));

        this.rightpectoral = new AdvancedModelRenderer(this);
        this.rightpectoral.setRotationPoint(-1.875F, 4.5F, 0.65F);
        this.body.addChild(rightpectoral);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.125F, 0.0F, 0.0F);
        this.rightpectoral.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.5236F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 36, 0.125F, 0.0F, 0.0F, 0, 5, 3, 0.0F, false));

        this.leftpectoral = new AdvancedModelRenderer(this);
        this.leftpectoral.setRotationPoint(1.875F, 4.5F, 0.65F);
        this.body.addChild(leftpectoral);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.125F, 0.0F, 0.0F);
        this.leftpectoral.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2618F, 0.0F, -0.5236F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 36, -0.125F, 0.0F, 0.0F, 0, 5, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -0.5F, 5.55F, 4, 6, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.5F, 5.0F, 5.55F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, -0.6109F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -0.625F, 0.25F, 0.0F, 0, 4, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, 5.0F, 5.55F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.6109F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 25, 0.625F, 0.25F, 0.0F, 0, 4, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(-0.505F, 2.5246F, 11.1423F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 33, 32, -1.495F, -1.0246F, 0.1827F, 3, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.005F, -2.3246F, 1.1827F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 26, 0.0F, -0.625F, -0.425F, 0, 3, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.005F, -3.0246F, 0.1827F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3578F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 11, -1.0F, 0.0F, 0.0F, 2, 2, 5, -0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.005F, 1.9317F, 3.3112F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.1214F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 39, -0.025F, -1.2461F, -1.2977F, 0, 5, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.005F, 2.9754F, 0.1827F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.336F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 32, -1.0F, -2.0F, 0.0F, 2, 2, 5, -0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.005F, 0.0754F, 4.1327F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 23, 36, -1.0F, -1.0F, -0.5F, 2, 2, 3, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.6772F, 2.1119F);
        this.tail.addChild(tail2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.3757F, 2.9371F);
        this.tail2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2182F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 13, 17, 0.0F, -0.45F, -2.9F, 0, 6, 8, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.3228F, 0.3881F);
        this.tail2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 22, 16, -0.5F, 0.0F, -1.0F, 1, 1, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -7.0F, -4.5F);
        this.varialepis.addChild(head);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 4, -1.5F, -1.425F, -1.5F, 3, 3, 3, 0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.1569F, -2.005F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3927F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 33, 0, -1.5F, 0.075F, -0.65F, 3, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.0132F, -3.3273F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.384F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 15, 0, -1.5F, -1.9915F, 0.0003F, 3, 2, 2, 0.001F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.875F, -2.8F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 19, -1.5F, -0.9988F, 0.0075F, 3, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.775F, -0.5F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 21, 0, -1.5F, -0.6F, -2.25F, 3, 1, 5, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.4249F, 1.3304F);
        this.head.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.1748F, 0.8881F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 25, -1.5F, 0.0109F, -4.9081F, 2, 1, 5, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.55F, 0.5431F, -1.505F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3054F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 0, -1.0F, -0.2F, -0.725F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 0, 1.1F, -0.2F, -0.725F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.varialepis.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(varialepis, 0.0F, 1.6F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.varialepis.offsetZ = -0.32F;
        this.varialepis.offsetX = -0.05F;
        this.varialepis.offsetY = -0.2F;
        this.varialepis.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.1F, 0.1F, 0.15F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        this.varialepis.offsetY = -0.1F;
        this.varialepis.offsetX = -0.0F;
        this.varialepis.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.varialepis.offsetY = -0.50F;
        this.varialepis.offsetX = 0.0F;
        this.varialepis.rotateAngleY = (float)Math.toRadians(130);
        this.varialepis.rotateAngleX = (float)Math.toRadians(9);
        this.varialepis.rotateAngleZ = (float)Math.toRadians(-2);
        this.varialepis.scaleChildren = true;
        float scaler = 1.1F;
        this.varialepis.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.1F, 0.1F, 0.15F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.1F, 0.0F);
        //End of pose, now render the model:
        this.varialepis.render(f);
        //Reset rotations, positions and sizing:
        this.varialepis.setScale(1.0F, 1.0F, 1.0F);
        this.varialepis.scaleChildren = false;
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
        //this.varialepis.offsetY = 1.2F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.tail, this.tail2};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(varialepis, speed, -0.18F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2F, f2, 1);
            this.walk(leftpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(leftpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(rightpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(rightpectoral, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.varialepis.rotateAngleZ = (float) Math.toRadians(90);
                //this.varialepis.offsetY = 1.25F;
                this.bob(varialepis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
