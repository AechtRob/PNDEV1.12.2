package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHaikouichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;

    public ModelHaikouichthys() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 30.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 21, 0, -1.0F, -9.0F, -4.3F, 2, 2, 5, 0.006F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, 0.025F, -10.25F, -4.3F, 0, 4, 10, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 15, -1.0F, -8.3F, -5.9F, 2, 1, 9, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.025F, -7.6582F, -6.298F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 14, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 14, 2.05F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.025F, -6.7353F, -4.7854F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 14, 0.0F, -1.2F, -0.8F, 0, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 14, 0.0F, -1.2F, 0.4F, 0, 1, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 14, 2.05F, -1.2F, 0.4F, 0, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 14, 2.05F, -1.2F, -0.8F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -6.7158F, -5.4508F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2094F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 23, -0.5F, 0.0F, -2.0F, 1, 0, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 22, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -6.5937F, -3.4545F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0611F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 36, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -6.6984F, 0.5441F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0262F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 36, 0, -0.5F, -1.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -6.8293F, 5.5424F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0262F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 15, -0.5F, -1.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -9.0F, 0.7F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 8, -0.5F, 0.0F, 0.0F, 2, 1, 5, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -9.0F, -4.3F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 31, 36, -0.5F, 0.0F, -1.0F, 2, 2, 1, -0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.175F, -7.5874F, -7.9265F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3622F, -0.7519F, -0.31F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 26, -0.725F, -0.5F, -0.1F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.175F, -7.5874F, -7.9265F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.3622F, 0.7519F, 0.31F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 26, -0.275F, -0.5F, -0.1F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -8.7412F, -5.2659F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 36, -0.5F, 0.0F, -3.0F, 2, 1, 3, 0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.5567F, 5.1175F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 33, 0.0F, -1.7035F, 0.4731F, 0, 3, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 4, 37, 0.0F, -0.2035F, 5.4731F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3F, -0.9207F, 0.1051F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1047F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 26, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.006F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 26, 0.1F, 0.0F, 0.0F, 1, 1, 5, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.3F, 0.6965F, -0.0269F);
        this.tail.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0218F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 29, -1.1F, -0.9691F, 0.0009F, 1, 1, 5, -0.003F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 29, -0.5F, -0.9691F, 0.0009F, 1, 1, 5, 0.0F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

        public void renderStaticDisplayCase(float f) {
            this.setRotateAngle(main, 0.0F, 0.0F, 1.5F);
            this.main.offsetX = 0.0F;
            this.main.offsetY = -0.1F;
            this.main.render(0.01F);
            resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -6.4F;
        this.main.offsetX = 2.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 6.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.main.offsetY = 1.25F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail};
        float speed = 0.385F;
        if (!e.isInWater()) {
            speed = 0.715F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2, f2, 1);
            this.chainSwing(fishTail, speed, 0.148F, -1.85, f2, 0.95F);
            this.swing(main, speed, 0.18F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.5F;
                this.bob(main, -speed, 2F, false, f2, 1);
            }
        }
    }
}
