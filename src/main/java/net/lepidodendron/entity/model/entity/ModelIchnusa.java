package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelIchnusa extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer tentacle1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tentacle1_1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tentacle2_1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tentacle3_1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tentacle4_1;
    private final AdvancedModelRenderer cube_r8;

    public ModelIchnusa() {
        textureWidth = 30;
        textureHeight = 15;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 23.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -1.0F, -2.5F, 3, 1, 5, 0.02F, false));
        main.cubeList.add(new ModelBox(main, 0, 11, -2.5F, -1.0F, -1.5F, 5, 1, 3, 0.02F, false));
        main.cubeList.add(new ModelBox(main, 17, 2, -1.5F, -2.0F, -1.5F, 3, 1, 3, 0.02F, false));

        tentacle1 = new AdvancedModelRenderer(this);
        tentacle1.setRotationPoint(0.0F, -1.0F, -1.0F);
        main.addChild(tentacle1);


        cube_r1 = new AdvancedModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        tentacle1.addChild(cube_r1);
        setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -1.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        tentacle1_1 = new AdvancedModelRenderer(this);
        tentacle1_1.setRotationPoint(0.0F, 1.8478F, -0.7654F);
        tentacle1.addChild(tentacle1_1);
        setRotateAngle(tentacle1_1, 0.3927F, 0.0F, 0.0F);


        cube_r2 = new AdvancedModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, -1.8478F, 0.7654F);
        tentacle1_1.addChild(cube_r2);
        setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, -1.5F, 2.0F, 0.0F, 3, 1, 0, 0.0F, false));

        tentacle2 = new AdvancedModelRenderer(this);
        tentacle2.setRotationPoint(-1.0F, -1.0F, 0.0F);
        main.addChild(tentacle2);


        cube_r3 = new AdvancedModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        tentacle2.addChild(cube_r3);
        setRotateAngle(cube_r3, 0.0F, 0.0F, 0.3927F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 4, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, false));

        tentacle2_1 = new AdvancedModelRenderer(this);
        tentacle2_1.setRotationPoint(-0.7654F, 1.8478F, 0.0F);
        tentacle2.addChild(tentacle2_1);
        setRotateAngle(tentacle2_1, 0.0F, 0.0F, -0.3927F);


        cube_r4 = new AdvancedModelRenderer(this);
        cube_r4.setRotationPoint(0.7654F, -1.8478F, 0.0F);
        tentacle2_1.addChild(cube_r4);
        setRotateAngle(cube_r4, 0.0F, 0.0F, 0.3927F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 6, 0.0F, 2.0F, -1.5F, 0, 1, 3, 0.0F, false));

        tentacle3 = new AdvancedModelRenderer(this);
        tentacle3.setRotationPoint(0.0F, -1.0F, 1.0F);
        main.addChild(tentacle3);


        cube_r5 = new AdvancedModelRenderer(this);
        cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        tentacle3.addChild(cube_r5);
        setRotateAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 7, -1.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        tentacle3_1 = new AdvancedModelRenderer(this);
        tentacle3_1.setRotationPoint(0.0F, 1.8478F, 0.7654F);
        tentacle3.addChild(tentacle3_1);
        setRotateAngle(tentacle3_1, -0.3927F, 0.0F, 0.0F);


        cube_r6 = new AdvancedModelRenderer(this);
        cube_r6.setRotationPoint(0.0F, -1.8478F, -0.7654F);
        tentacle3_1.addChild(cube_r6);
        setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 9, -1.5F, 2.0F, 0.0F, 3, 1, 0, 0.0F, false));

        tentacle4 = new AdvancedModelRenderer(this);
        tentacle4.setRotationPoint(1.0F, -1.0F, 0.0F);
        main.addChild(tentacle4);


        cube_r7 = new AdvancedModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        tentacle4.addChild(cube_r7);
        setRotateAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 4, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, false));

        tentacle4_1 = new AdvancedModelRenderer(this);
        tentacle4_1.setRotationPoint(0.7654F, 1.8478F, 0.0F);
        tentacle4.addChild(tentacle4_1);
        setRotateAngle(tentacle4_1, 0.0F, 0.0F, 0.3927F);


        cube_r8 = new AdvancedModelRenderer(this);
        cube_r8.setRotationPoint(-0.7654F, -1.8478F, 0.0F);
        tentacle4_1.addChild(cube_r8);
        setRotateAngle(cube_r8, 0.0F, 0.0F, -0.3927F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 6, 0.0F, 2.0F, -1.5F, 0, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.70F);

        this.main.render(f5);
        GlStateManager.disableBlend();

    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.75F;
        this.main.offsetX = -0.F;
        this.main.rotateAngleY = (float)Math.toRadians(165);
        this.main.rotateAngleX = (float)Math.toRadians(22);
        this.main.rotateAngleZ = (float)Math.toRadians(-28);
        this.main.scaleChildren = true;
        float scaler = 2.25F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.45F);
        this.main.render(f);
        GlStateManager.disableBlend();

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

        float speed = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.main.scaleChildren = true;
            this.main.setScale(1.0F, 1.0F, 1.0F);
            this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(main, -speed * 0.5F, 0.5F, false, f2, 0.6F);

            AdvancedModelRenderer[] tentacleu1 = {this.tentacle1, this.tentacle1_1};
            AdvancedModelRenderer[] tentacleu2 = {this.tentacle2, this.tentacle2_1};
            AdvancedModelRenderer[] tentacleu3 = {this.tentacle3, this.tentacle3_1};
            AdvancedModelRenderer[] tentacleu4 = {this.tentacle4, this.tentacle4_1};
            this.chainWave(tentacleu1, speed * 2.0F, -0.4F, -3, f2, 1.0F);
            this.chainFlap(tentacleu2, speed * 2.0F, 0.4F, -3, f2, 1.0F);
            this.chainWave(tentacleu3, speed * 2.0F, -0.4F, -3, f2, 1.0F);
            this.chainFlap(tentacleu4, speed * 2.0F, 0.4F, -3, f2, 1.0F);
        }
        else {
            this.main.scaleChildren = true;
            this.main.setScale(1.25F, 0.1F, 1.25F);
        }

    }
}
