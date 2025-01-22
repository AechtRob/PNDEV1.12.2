package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;

public class ModelEoporpita extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer upper_tentcles;
    private final AdvancedModelRenderer upper_tentcles2;
    private final AdvancedModelRenderer upper_tentcles3;
    private final AdvancedModelRenderer upper_tentcles4;
    private final AdvancedModelRenderer upper_tentcles5;
    private final AdvancedModelRenderer upper_tentcles6;
    private final AdvancedModelRenderer upper_tentcles7;
    private final AdvancedModelRenderer ut_4;
    private final AdvancedModelRenderer ut_4_1;
    private final AdvancedModelRenderer middle_tentcles;
    private final AdvancedModelRenderer middle_tentcles2;
    private final AdvancedModelRenderer middle_tentcles3;
    private final AdvancedModelRenderer middle_tentcles4;
    private final AdvancedModelRenderer middle_tentcles5;
    private final AdvancedModelRenderer lower_tenctles;
    private final AdvancedModelRenderer lower_tenctles2;
    private final AdvancedModelRenderer lower_tenctles3;
    private final AdvancedModelRenderer lower_tenctles4;
    private final AdvancedModelRenderer lower_tenctles5;

    public ModelEoporpita() {
        textureWidth = 35;
        textureHeight = 20;

        main = new AdvancedModelRenderer(this);
        main.setRotationPoint(0.0F, 23.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 10, 6, -2.0F, -1.0F, -2.0F, 4, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 18, 13, -2.0F, -1.25F, -2.0F, 4, 1, 4, -0.01F, false));
        main.cubeList.add(new ModelBox(main, 0, 12, -3.0F, -1.0F, -3.0F, 6, 1, 6, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

        upper_tentcles = new AdvancedModelRenderer(this);
        upper_tentcles.setRotationPoint(0.0F, -0.25F, 0.0F);
        main.addChild(upper_tentcles);


        upper_tentcles2 = new AdvancedModelRenderer(this);
        upper_tentcles2.setRotationPoint(0.0F, 0.0F, 2.0F);
        upper_tentcles.addChild(upper_tentcles2);
        setRotateAngle(upper_tentcles2, -0.3927F, 0.0F, 0.0F);
        upper_tentcles2.cubeList.add(new ModelBox(upper_tentcles2, 14, 3, -2.5F, 0.0F, 0.0F, 5, 0, 2, 0.0F, false));

        upper_tentcles3 = new AdvancedModelRenderer(this);
        upper_tentcles3.setRotationPoint(0.0F, 0.0F, 2.0F);
        upper_tentcles2.addChild(upper_tentcles3);
        upper_tentcles3.cubeList.add(new ModelBox(upper_tentcles3, 15, 2, -2.5F, 0.0F, 0.0F, 5, 0, 1, 0.0F, false));

        upper_tentcles4 = new AdvancedModelRenderer(this);
        upper_tentcles4.setRotationPoint(-2.0F, 0.0F, 0.0F);
        upper_tentcles.addChild(upper_tentcles4);
        setRotateAngle(upper_tentcles4, 0.0F, 0.0F, -0.3927F);
        upper_tentcles4.cubeList.add(new ModelBox(upper_tentcles4, 1, 0, -2.0F, 0.0F, -2.5F, 2, 0, 5, 0.0F, false));

        upper_tentcles5 = new AdvancedModelRenderer(this);
        upper_tentcles5.setRotationPoint(-2.0F, 0.0F, 0.0F);
        upper_tentcles4.addChild(upper_tentcles5);
        upper_tentcles5.cubeList.add(new ModelBox(upper_tentcles5, -1, 0, -1.0F, 0.0F, -2.5F, 1, 0, 5, 0.0F, false));

        upper_tentcles6 = new AdvancedModelRenderer(this);
        upper_tentcles6.setRotationPoint(0.0F, 0.0F, -2.0F);
        upper_tentcles.addChild(upper_tentcles6);
        setRotateAngle(upper_tentcles6, 0.3927F, 0.0F, 0.0F);
        upper_tentcles6.cubeList.add(new ModelBox(upper_tentcles6, 14, 0, -2.5F, 0.0F, -2.0F, 5, 0, 2, 0.0F, false));

        upper_tentcles7 = new AdvancedModelRenderer(this);
        upper_tentcles7.setRotationPoint(0.0F, 0.0F, -2.0F);
        upper_tentcles6.addChild(upper_tentcles7);
        upper_tentcles7.cubeList.add(new ModelBox(upper_tentcles7, 15, 2, -2.5F, 0.0F, -1.0F, 5, 0, 1, 0.0F, false));

        ut_4 = new AdvancedModelRenderer(this);
        ut_4.setRotationPoint(2.0F, 0.0F, 0.0F);
        upper_tentcles.addChild(ut_4);
        setRotateAngle(ut_4, 0.0F, 0.0F, 0.3927F);
        ut_4.cubeList.add(new ModelBox(ut_4, 5, 0, 0.0F, 0.0F, -2.5F, 2, 0, 5, 0.0F, false));

        ut_4_1 = new AdvancedModelRenderer(this);
        ut_4_1.setRotationPoint(2.0F, 0.0F, 0.0F);
        ut_4.addChild(ut_4_1);
        ut_4_1.cubeList.add(new ModelBox(ut_4_1, -1, 0, 0.0F, 0.0F, -2.5F, 1, 0, 5, 0.0F, false));

        middle_tentcles = new AdvancedModelRenderer(this);
        middle_tentcles.setRotationPoint(0.0F, 0.5F, 0.0F);
        main.addChild(middle_tentcles);


        middle_tentcles2 = new AdvancedModelRenderer(this);
        middle_tentcles2.setRotationPoint(-2.0F, 0.0F, 0.0F);
        middle_tentcles.addChild(middle_tentcles2);
        setRotateAngle(middle_tentcles2, 0.0F, 0.0F, -0.3927F);
        middle_tentcles2.cubeList.add(new ModelBox(middle_tentcles2, 10, 0, -1.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        middle_tentcles3 = new AdvancedModelRenderer(this);
        middle_tentcles3.setRotationPoint(0.0F, 0.0F, 2.0F);
        middle_tentcles.addChild(middle_tentcles3);
        setRotateAngle(middle_tentcles3, -0.3927F, 0.0F, 0.0F);
        middle_tentcles3.cubeList.add(new ModelBox(middle_tentcles3, 3, 5, -2.0F, 0.0F, 0.0F, 4, 0, 1, 0.0F, false));

        middle_tentcles4 = new AdvancedModelRenderer(this);
        middle_tentcles4.setRotationPoint(2.0F, 0.0F, 0.0F);
        middle_tentcles.addChild(middle_tentcles4);
        setRotateAngle(middle_tentcles4, 0.0F, 0.0F, 0.3927F);
        middle_tentcles4.cubeList.add(new ModelBox(middle_tentcles4, 10, 0, 0.0F, 0.0F, -2.0F, 1, 0, 4, 0.0F, false));

        middle_tentcles5 = new AdvancedModelRenderer(this);
        middle_tentcles5.setRotationPoint(0.0F, 0.0F, -2.0F);
        middle_tentcles.addChild(middle_tentcles5);
        setRotateAngle(middle_tentcles5, 0.3927F, 0.0F, 0.0F);
        middle_tentcles5.cubeList.add(new ModelBox(middle_tentcles5, 3, 5, -2.0F, 0.0F, -1.0F, 4, 0, 1, 0.0F, false));

        lower_tenctles = new AdvancedModelRenderer(this);
        lower_tenctles.setRotationPoint(0.0F, 1.0F, 0.0F);
        main.addChild(lower_tenctles);


        lower_tenctles2 = new AdvancedModelRenderer(this);
        lower_tenctles2.setRotationPoint(0.0F, 0.0F, -0.5F);
        lower_tenctles.addChild(lower_tenctles2);
        setRotateAngle(lower_tenctles2, 0.3927F, 0.0F, 0.0F);
        lower_tenctles2.cubeList.add(new ModelBox(lower_tenctles2, -2, 8, -1.5F, 0.0F, -2.0F, 3, 0, 2, 0.0F, false));

        lower_tenctles3 = new AdvancedModelRenderer(this);
        lower_tenctles3.setRotationPoint(0.0F, 0.0F, 0.5F);
        lower_tenctles.addChild(lower_tenctles3);
        setRotateAngle(lower_tenctles3, -0.3927F, 0.0F, 0.0F);
        lower_tenctles3.cubeList.add(new ModelBox(lower_tenctles3, -2, 6, -1.5F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        lower_tenctles4 = new AdvancedModelRenderer(this);
        lower_tenctles4.setRotationPoint(0.5F, 0.0F, 0.0F);
        lower_tenctles.addChild(lower_tenctles4);
        setRotateAngle(lower_tenctles4, 0.0F, 0.0F, 0.3927F);
        lower_tenctles4.cubeList.add(new ModelBox(lower_tenctles4, 7, 6, 0.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

        lower_tenctles5 = new AdvancedModelRenderer(this);
        lower_tenctles5.setRotationPoint(-0.5F, 0.0F, 0.0F);
        lower_tenctles.addChild(lower_tenctles5);
        setRotateAngle(lower_tenctles5, 0.0F, 0.0F, -0.3927F);
        lower_tenctles5.cubeList.add(new ModelBox(lower_tenctles5, 3, 6, -2.0F, 0.0F, -1.5F, 2, 0, 3, 0.0F, false));

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
        this.main.offsetY = -0.52F;
        this.main.offsetX = -0.1F;
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

        main.offsetY = -0.15F;

        float speed = 0.1F;
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled() && e.isInWater()) {
            this.main.scaleChildren = true;
            this.main.setScale(1.0F, 1.0F, 1.0F);
            this.swing(main, speed * 0.4F, 0.25F, true, 0, 0, f2, 0.6F);
            this.walk(main, speed * 0.3F, 0.4F, true, 0, 0, f2, 0.6F);
            this.flap(main, speed * 0.2F, 0.4F, true, 0, 0, f2, 0.6F);
            this.bob(main, -speed * 0.5F, 0.5F, false, f2, 0.6F);


            this.swing(upper_tentcles, speed * 0.8F, 0.25F, true, 3.0F, 0, f2, 0.6F);
            AdvancedModelRenderer[] tentacleu1 = {this.upper_tentcles2, this.upper_tentcles3};
            AdvancedModelRenderer[] tentacleu2 = {this.upper_tentcles4, this.upper_tentcles5};
            AdvancedModelRenderer[] tentacleu3 = {this.upper_tentcles6, this.upper_tentcles7};
            AdvancedModelRenderer[] tentacleu4 = {this.ut_4, this.ut_4_1};
            this.chainWave(tentacleu1, speed * 2.0F, -0.4F, -3, f2, 1.0F);
            this.chainFlap(tentacleu2, speed * 2.0F, -0.4F, -3, f2, 1.0F);
            this.chainWave(tentacleu3, speed * 2.0F, 0.4F, -3, f2, 1.0F);
            this.chainFlap(tentacleu4, speed * 2.0F, 0.4F, -3, f2, 1.0F);

            this.flap(middle_tentcles2, speed * 2.0F, -0.5F,false, 0, 0, f2, 1.0F) ;
            this.walk(middle_tentcles3, speed * 2.0F, -0.5F,false, 0, 0, f2, 1.0F); ;
            this.flap(middle_tentcles4, speed * 2.0F, 0.5F,false, 0, 0, f2, 1.0F) ;
            this.walk(middle_tentcles5, speed * 2.0F, 0.5F,false, 0, 0, f2, 1.0F) ;

            this.walk(lower_tenctles2, speed * 2.0F, -0.15F,false, 0, 0, f2, 1.0F); ;
            this.flap(lower_tenctles3, speed * 2.0F, -0.15F,false, 0, 0, f2, 1.0F); ;
            this.walk(lower_tenctles4, speed * 2.0F, 0.15F,false, 0, 0, f2, 1.0F); ;
            this.flap(lower_tenctles5, speed * 2.0F, 0.15F,false, 0, 0, f2, 1.0F); ;
            
        }
        else {
            this.main.scaleChildren = true;
            this.main.setScale(1.25F, 0.1F, 1.25F);
            main.offsetY = 0.05F;
        }

    }
}
