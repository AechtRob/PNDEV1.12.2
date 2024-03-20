package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCtenorhabdotus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public class ModelCtenorhabdotus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer jellypart;
    private final AdvancedModelRenderer southluminescent;
    private final AdvancedModelRenderer southlumi;
    private final AdvancedModelRenderer southlumi2;
    private final AdvancedModelRenderer southlumi3;
    private final AdvancedModelRenderer southlumi4;
    private final AdvancedModelRenderer southlumi5;
    private final AdvancedModelRenderer southlumi6;
    private final AdvancedModelRenderer southlumi7;
    private final AdvancedModelRenderer southluminescent2;
    private final AdvancedModelRenderer southlumi8;
    private final AdvancedModelRenderer southlumi9;
    private final AdvancedModelRenderer southlumi10;
    private final AdvancedModelRenderer southlumi11;
    private final AdvancedModelRenderer southlumi12;
    private final AdvancedModelRenderer southlumi13;
    private final AdvancedModelRenderer southlumi14;
    private final AdvancedModelRenderer southluminescent3;
    private final AdvancedModelRenderer southlumi15;
    private final AdvancedModelRenderer southlumi16;
    private final AdvancedModelRenderer southlumi17;
    private final AdvancedModelRenderer southlumi18;
    private final AdvancedModelRenderer southlumi19;
    private final AdvancedModelRenderer southlumi20;
    private final AdvancedModelRenderer southlumi21;
    private final AdvancedModelRenderer northluminescent;
    private final AdvancedModelRenderer northlumi;
    private final AdvancedModelRenderer northlumi2;
    private final AdvancedModelRenderer northlumi3;
    private final AdvancedModelRenderer northlumi4;
    private final AdvancedModelRenderer northlumi5;
    private final AdvancedModelRenderer northlumi6;
    private final AdvancedModelRenderer northlumi7;
    private final AdvancedModelRenderer northluminescent2;
    private final AdvancedModelRenderer northlumi8;
    private final AdvancedModelRenderer northlumi9;
    private final AdvancedModelRenderer northlumi10;
    private final AdvancedModelRenderer northlumi11;
    private final AdvancedModelRenderer northlumi12;
    private final AdvancedModelRenderer northlumi13;
    private final AdvancedModelRenderer northlumi14;
    private final AdvancedModelRenderer northluminescent3;
    private final AdvancedModelRenderer northlumi15;
    private final AdvancedModelRenderer northlumi16;
    private final AdvancedModelRenderer northlumi17;
    private final AdvancedModelRenderer northlumi18;
    private final AdvancedModelRenderer northlumi19;
    private final AdvancedModelRenderer northlumi20;
    private final AdvancedModelRenderer northlumi21;
    private final AdvancedModelRenderer eastluminescent;
    private final AdvancedModelRenderer eastlumi;
    private final AdvancedModelRenderer eastlumi2;
    private final AdvancedModelRenderer eastlumi3;
    private final AdvancedModelRenderer eastlumi4;
    private final AdvancedModelRenderer eastlumi5;
    private final AdvancedModelRenderer eastlumi6;
    private final AdvancedModelRenderer eastlumi7;
    private final AdvancedModelRenderer eastluminescent2;
    private final AdvancedModelRenderer eastlumi8;
    private final AdvancedModelRenderer eastlumi9;
    private final AdvancedModelRenderer eastlumi10;
    private final AdvancedModelRenderer eastlumi11;
    private final AdvancedModelRenderer eastlumi12;
    private final AdvancedModelRenderer eastlumi13;
    private final AdvancedModelRenderer eastlumi14;
    private final AdvancedModelRenderer eastluminescent3;
    private final AdvancedModelRenderer eastlumi15;
    private final AdvancedModelRenderer eastlumi16;
    private final AdvancedModelRenderer eastlumi17;
    private final AdvancedModelRenderer eastlumi18;
    private final AdvancedModelRenderer eastlumi19;
    private final AdvancedModelRenderer eastlumi20;
    private final AdvancedModelRenderer eastlumi21;
    private final AdvancedModelRenderer westluminescent;
    private final AdvancedModelRenderer westlumi;
    private final AdvancedModelRenderer westlumi2;
    private final AdvancedModelRenderer westlumi3;
    private final AdvancedModelRenderer westlumi4;
    private final AdvancedModelRenderer westlumi5;
    private final AdvancedModelRenderer westlumi6;
    private final AdvancedModelRenderer westlumi7;
    private final AdvancedModelRenderer westluminescent2;
    private final AdvancedModelRenderer westlumi8;
    private final AdvancedModelRenderer westlumi9;
    private final AdvancedModelRenderer westlumi10;
    private final AdvancedModelRenderer westlumi11;
    private final AdvancedModelRenderer westlumi12;
    private final AdvancedModelRenderer westlumi13;
    private final AdvancedModelRenderer westlumi14;
    private final AdvancedModelRenderer westluminescent3;
    private final AdvancedModelRenderer westlumi15;
    private final AdvancedModelRenderer westlumi16;
    private final AdvancedModelRenderer westlumi17;
    private final AdvancedModelRenderer westlumi18;
    private final AdvancedModelRenderer westlumi19;
    private final AdvancedModelRenderer westlumi20;
    private final AdvancedModelRenderer westlumi21;

    private ModelAnimator animator;

    public ModelCtenorhabdotus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -8.0F, -3.0F, 6, 8, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 19, 0, -2.0F, -8.5F, -2.0F, 4, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -9.1F, -0.5F, 1, 1, 1, 0.0F, false));

        this.jellypart = new AdvancedModelRenderer(this);
        this.jellypart.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.main.addChild(jellypart);
        this.jellypart.cubeList.add(new ModelBox(jellypart, 0, 15, -2.5F, 0.0F, -2.5F, 5, 2, 5, 0.0F, false));

        this.southluminescent = new AdvancedModelRenderer(this);
        this.southluminescent.setRotationPoint(-1.0F, 0.0F, 0.025F);
        this.main.addChild(southluminescent);


        this.southlumi = new AdvancedModelRenderer(this);
        this.southlumi.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.southluminescent.addChild(southlumi);
        this.southlumi.cubeList.add(new ModelBox(southlumi, 9, 30, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi2 = new AdvancedModelRenderer(this);
        this.southlumi2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.southluminescent.addChild(southlumi2);
        this.southlumi2.cubeList.add(new ModelBox(southlumi2, 6, 30, -1.0F, -1.0F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi3 = new AdvancedModelRenderer(this);
        this.southlumi3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.southluminescent.addChild(southlumi3);
        this.southlumi3.cubeList.add(new ModelBox(southlumi3, 29, 16, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi4 = new AdvancedModelRenderer(this);
        this.southlumi4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.southluminescent.addChild(southlumi4);
        this.southlumi4.cubeList.add(new ModelBox(southlumi4, 29, 14, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi5 = new AdvancedModelRenderer(this);
        this.southlumi5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.southluminescent.addChild(southlumi5);
        this.southlumi5.cubeList.add(new ModelBox(southlumi5, 24, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi6 = new AdvancedModelRenderer(this);
        this.southlumi6.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.southluminescent.addChild(southlumi6);
        this.southlumi6.cubeList.add(new ModelBox(southlumi6, 28, 21, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi7 = new AdvancedModelRenderer(this);
        this.southlumi7.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.southluminescent.addChild(southlumi7);
        this.southlumi7.cubeList.add(new ModelBox(southlumi7, 21, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southluminescent2 = new AdvancedModelRenderer(this);
        this.southluminescent2.setRotationPoint(2.0F, 0.0F, 0.025F);
        this.main.addChild(southluminescent2);


        this.southlumi8 = new AdvancedModelRenderer(this);
        this.southlumi8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.southluminescent2.addChild(southlumi8);
        this.southlumi8.cubeList.add(new ModelBox(southlumi8, 12, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi9 = new AdvancedModelRenderer(this);
        this.southlumi9.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.southluminescent2.addChild(southlumi9);
        this.southlumi9.cubeList.add(new ModelBox(southlumi9, 28, 10, -1.0F, -1.0F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi10 = new AdvancedModelRenderer(this);
        this.southlumi10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.southluminescent2.addChild(southlumi10);
        this.southlumi10.cubeList.add(new ModelBox(southlumi10, 9, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi11 = new AdvancedModelRenderer(this);
        this.southlumi11.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.southluminescent2.addChild(southlumi11);
        this.southlumi11.cubeList.add(new ModelBox(southlumi11, 28, 8, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi12 = new AdvancedModelRenderer(this);
        this.southlumi12.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.southluminescent2.addChild(southlumi12);
        this.southlumi12.cubeList.add(new ModelBox(southlumi12, 28, 6, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi13 = new AdvancedModelRenderer(this);
        this.southlumi13.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.southluminescent2.addChild(southlumi13);
        this.southlumi13.cubeList.add(new ModelBox(southlumi13, 6, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi14 = new AdvancedModelRenderer(this);
        this.southlumi14.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.southluminescent2.addChild(southlumi14);
        this.southlumi14.cubeList.add(new ModelBox(southlumi14, 27, 24, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southluminescent3 = new AdvancedModelRenderer(this);
        this.southluminescent3.setRotationPoint(0.5F, 0.0F, 0.025F);
        this.main.addChild(southluminescent3);


        this.southlumi15 = new AdvancedModelRenderer(this);
        this.southlumi15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.southluminescent3.addChild(southlumi15);
        this.southlumi15.cubeList.add(new ModelBox(southlumi15, 12, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi16 = new AdvancedModelRenderer(this);
        this.southlumi16.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.southluminescent3.addChild(southlumi16);
        this.southlumi16.cubeList.add(new ModelBox(southlumi16, 28, 10, -1.0F, -1.0F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi17 = new AdvancedModelRenderer(this);
        this.southlumi17.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.southluminescent3.addChild(southlumi17);
        this.southlumi17.cubeList.add(new ModelBox(southlumi17, 9, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi18 = new AdvancedModelRenderer(this);
        this.southlumi18.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.southluminescent3.addChild(southlumi18);
        this.southlumi18.cubeList.add(new ModelBox(southlumi18, 28, 8, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi19 = new AdvancedModelRenderer(this);
        this.southlumi19.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.southluminescent3.addChild(southlumi19);
        this.southlumi19.cubeList.add(new ModelBox(southlumi19, 28, 6, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi20 = new AdvancedModelRenderer(this);
        this.southlumi20.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.southluminescent3.addChild(southlumi20);
        this.southlumi20.cubeList.add(new ModelBox(southlumi20, 6, 28, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.southlumi21 = new AdvancedModelRenderer(this);
        this.southlumi21.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.southluminescent3.addChild(southlumi21);
        this.southlumi21.cubeList.add(new ModelBox(southlumi21, 27, 24, -1.0F, -1.5F, 3.0F, 1, 1, 0, 0.0F, false));

        this.northluminescent = new AdvancedModelRenderer(this);
        this.northluminescent.setRotationPoint(2.0F, 0.0F, -0.025F);
        this.main.addChild(northluminescent);


        this.northlumi = new AdvancedModelRenderer(this);
        this.northlumi.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.northluminescent.addChild(northlumi);
        this.northlumi.cubeList.add(new ModelBox(northlumi, 3, 29, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi2 = new AdvancedModelRenderer(this);
        this.northlumi2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.northluminescent.addChild(northlumi2);
        this.northlumi2.cubeList.add(new ModelBox(northlumi2, 0, 29, -1.0F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi3 = new AdvancedModelRenderer(this);
        this.northlumi3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.northluminescent.addChild(northlumi3);
        this.northlumi3.cubeList.add(new ModelBox(northlumi3, 27, 28, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi4 = new AdvancedModelRenderer(this);
        this.northlumi4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.northluminescent.addChild(northlumi4);
        this.northlumi4.cubeList.add(new ModelBox(northlumi4, 28, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi5 = new AdvancedModelRenderer(this);
        this.northlumi5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.northluminescent.addChild(northlumi5);
        this.northlumi5.cubeList.add(new ModelBox(northlumi5, 18, 28, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi6 = new AdvancedModelRenderer(this);
        this.northlumi6.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.northluminescent.addChild(northlumi6);
        this.northlumi6.cubeList.add(new ModelBox(northlumi6, 15, 28, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi7 = new AdvancedModelRenderer(this);
        this.northlumi7.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.northluminescent.addChild(northlumi7);
        this.northlumi7.cubeList.add(new ModelBox(northlumi7, 28, 12, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northluminescent2 = new AdvancedModelRenderer(this);
        this.northluminescent2.setRotationPoint(-1.0F, 0.0F, -0.025F);
        this.main.addChild(northluminescent2);


        this.northlumi8 = new AdvancedModelRenderer(this);
        this.northlumi8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.northluminescent2.addChild(northlumi8);
        this.northlumi8.cubeList.add(new ModelBox(northlumi8, 27, 19, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi9 = new AdvancedModelRenderer(this);
        this.northlumi9.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.northluminescent2.addChild(northlumi9);
        this.northlumi9.cubeList.add(new ModelBox(northlumi9, 26, 17, -1.0F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi10 = new AdvancedModelRenderer(this);
        this.northlumi10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.northluminescent2.addChild(northlumi10);
        this.northlumi10.cubeList.add(new ModelBox(northlumi10, 26, 15, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi11 = new AdvancedModelRenderer(this);
        this.northlumi11.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.northluminescent2.addChild(northlumi11);
        this.northlumi11.cubeList.add(new ModelBox(northlumi11, 15, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi12 = new AdvancedModelRenderer(this);
        this.northlumi12.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.northluminescent2.addChild(northlumi12);
        this.northlumi12.cubeList.add(new ModelBox(northlumi12, 12, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi13 = new AdvancedModelRenderer(this);
        this.northlumi13.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.northluminescent2.addChild(northlumi13);
        this.northlumi13.cubeList.add(new ModelBox(northlumi13, 9, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi14 = new AdvancedModelRenderer(this);
        this.northlumi14.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.northluminescent2.addChild(northlumi14);
        this.northlumi14.cubeList.add(new ModelBox(northlumi14, 6, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northluminescent3 = new AdvancedModelRenderer(this);
        this.northluminescent3.setRotationPoint(0.5F, 0.0F, -0.025F);
        this.main.addChild(northluminescent3);


        this.northlumi15 = new AdvancedModelRenderer(this);
        this.northlumi15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.northluminescent3.addChild(northlumi15);
        this.northlumi15.cubeList.add(new ModelBox(northlumi15, 27, 19, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi16 = new AdvancedModelRenderer(this);
        this.northlumi16.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.northluminescent3.addChild(northlumi16);
        this.northlumi16.cubeList.add(new ModelBox(northlumi16, 26, 17, -1.0F, -1.0F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi17 = new AdvancedModelRenderer(this);
        this.northlumi17.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.northluminescent3.addChild(northlumi17);
        this.northlumi17.cubeList.add(new ModelBox(northlumi17, 26, 15, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi18 = new AdvancedModelRenderer(this);
        this.northlumi18.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.northluminescent3.addChild(northlumi18);
        this.northlumi18.cubeList.add(new ModelBox(northlumi18, 15, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi19 = new AdvancedModelRenderer(this);
        this.northlumi19.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.northluminescent3.addChild(northlumi19);
        this.northlumi19.cubeList.add(new ModelBox(northlumi19, 12, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi20 = new AdvancedModelRenderer(this);
        this.northlumi20.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.northluminescent3.addChild(northlumi20);
        this.northlumi20.cubeList.add(new ModelBox(northlumi20, 9, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.northlumi21 = new AdvancedModelRenderer(this);
        this.northlumi21.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.northluminescent3.addChild(northlumi21);
        this.northlumi21.cubeList.add(new ModelBox(northlumi21, 6, 26, -1.0F, -1.5F, -3.0F, 1, 1, 0, 0.0F, false));

        this.eastluminescent = new AdvancedModelRenderer(this);
        this.eastluminescent.setRotationPoint(-2.025F, 0.0F, 1.0F);
        this.main.addChild(eastluminescent);


        this.eastlumi = new AdvancedModelRenderer(this);
        this.eastlumi.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eastluminescent.addChild(eastlumi);
        this.eastlumi.cubeList.add(new ModelBox(eastlumi, 3, 26, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi2 = new AdvancedModelRenderer(this);
        this.eastlumi2.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.eastluminescent.addChild(eastlumi2);
        this.eastlumi2.cubeList.add(new ModelBox(eastlumi2, 0, 26, -1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi3 = new AdvancedModelRenderer(this);
        this.eastlumi3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.eastluminescent.addChild(eastlumi3);
        this.eastlumi3.cubeList.add(new ModelBox(eastlumi3, 25, 25, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi4 = new AdvancedModelRenderer(this);
        this.eastlumi4.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.eastluminescent.addChild(eastlumi4);
        this.eastlumi4.cubeList.add(new ModelBox(eastlumi4, 25, 21, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi5 = new AdvancedModelRenderer(this);
        this.eastlumi5.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.eastluminescent.addChild(eastlumi5);
        this.eastlumi5.cubeList.add(new ModelBox(eastlumi5, 23, 15, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi6 = new AdvancedModelRenderer(this);
        this.eastlumi6.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.eastluminescent.addChild(eastlumi6);
        this.eastlumi6.cubeList.add(new ModelBox(eastlumi6, 15, 23, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi7 = new AdvancedModelRenderer(this);
        this.eastlumi7.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.eastluminescent.addChild(eastlumi7);
        this.eastlumi7.cubeList.add(new ModelBox(eastlumi7, 12, 23, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastluminescent2 = new AdvancedModelRenderer(this);
        this.eastluminescent2.setRotationPoint(-2.025F, 0.0F, 4.0F);
        this.main.addChild(eastluminescent2);


        this.eastlumi8 = new AdvancedModelRenderer(this);
        this.eastlumi8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eastluminescent2.addChild(eastlumi8);
        this.eastlumi8.cubeList.add(new ModelBox(eastlumi8, 19, 0, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi9 = new AdvancedModelRenderer(this);
        this.eastlumi9.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.eastluminescent2.addChild(eastlumi9);
        this.eastlumi9.cubeList.add(new ModelBox(eastlumi9, 18, 17, -1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi10 = new AdvancedModelRenderer(this);
        this.eastlumi10.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.eastluminescent2.addChild(eastlumi10);
        this.eastlumi10.cubeList.add(new ModelBox(eastlumi10, 2, 17, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi11 = new AdvancedModelRenderer(this);
        this.eastlumi11.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.eastluminescent2.addChild(eastlumi11);
        this.eastlumi11.cubeList.add(new ModelBox(eastlumi11, 16, 15, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi12 = new AdvancedModelRenderer(this);
        this.eastlumi12.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.eastluminescent2.addChild(eastlumi12);
        this.eastlumi12.cubeList.add(new ModelBox(eastlumi12, 0, 15, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi13 = new AdvancedModelRenderer(this);
        this.eastlumi13.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.eastluminescent2.addChild(eastlumi13);
        this.eastlumi13.cubeList.add(new ModelBox(eastlumi13, 3, 3, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi14 = new AdvancedModelRenderer(this);
        this.eastlumi14.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.eastluminescent2.addChild(eastlumi14);
        this.eastlumi14.cubeList.add(new ModelBox(eastlumi14, 0, 3, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastluminescent3 = new AdvancedModelRenderer(this);
        this.eastluminescent3.setRotationPoint(-2.025F, 0.0F, 2.5F);
        this.main.addChild(eastluminescent3);


        this.eastlumi15 = new AdvancedModelRenderer(this);
        this.eastlumi15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eastluminescent3.addChild(eastlumi15);
        this.eastlumi15.cubeList.add(new ModelBox(eastlumi15, 19, 0, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi16 = new AdvancedModelRenderer(this);
        this.eastlumi16.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.eastluminescent3.addChild(eastlumi16);
        this.eastlumi16.cubeList.add(new ModelBox(eastlumi16, 18, 17, -1.0F, -1.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi17 = new AdvancedModelRenderer(this);
        this.eastlumi17.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.eastluminescent3.addChild(eastlumi17);
        this.eastlumi17.cubeList.add(new ModelBox(eastlumi17, 2, 17, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi18 = new AdvancedModelRenderer(this);
        this.eastlumi18.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.eastluminescent3.addChild(eastlumi18);
        this.eastlumi18.cubeList.add(new ModelBox(eastlumi18, 16, 15, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi19 = new AdvancedModelRenderer(this);
        this.eastlumi19.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.eastluminescent3.addChild(eastlumi19);
        this.eastlumi19.cubeList.add(new ModelBox(eastlumi19, 0, 15, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi20 = new AdvancedModelRenderer(this);
        this.eastlumi20.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.eastluminescent3.addChild(eastlumi20);
        this.eastlumi20.cubeList.add(new ModelBox(eastlumi20, 3, 3, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.eastlumi21 = new AdvancedModelRenderer(this);
        this.eastlumi21.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.eastluminescent3.addChild(eastlumi21);
        this.eastlumi21.cubeList.add(new ModelBox(eastlumi21, 0, 3, -1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westluminescent = new AdvancedModelRenderer(this);
        this.westluminescent.setRotationPoint(2.025F, 0.0F, 4.0F);
        this.main.addChild(westluminescent);


        this.westlumi = new AdvancedModelRenderer(this);
        this.westlumi.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.westluminescent.addChild(westlumi);
        this.westlumi.cubeList.add(new ModelBox(westlumi, 20, 25, 1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi2 = new AdvancedModelRenderer(this);
        this.westlumi2.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.westluminescent.addChild(westlumi2);
        this.westlumi2.cubeList.add(new ModelBox(westlumi2, 25, 12, 1.0F, 0.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi3 = new AdvancedModelRenderer(this);
        this.westlumi3.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.westluminescent.addChild(westlumi3);
        this.westlumi3.cubeList.add(new ModelBox(westlumi3, 25, 9, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi4 = new AdvancedModelRenderer(this);
        this.westlumi4.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.westluminescent.addChild(westlumi4);
        this.westlumi4.cubeList.add(new ModelBox(westlumi4, 25, 6, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi5 = new AdvancedModelRenderer(this);
        this.westlumi5.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.westluminescent.addChild(westlumi5);
        this.westlumi5.cubeList.add(new ModelBox(westlumi5, 24, 18, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi6 = new AdvancedModelRenderer(this);
        this.westlumi6.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.westluminescent.addChild(westlumi6);
        this.westlumi6.cubeList.add(new ModelBox(westlumi6, 23, 23, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi7 = new AdvancedModelRenderer(this);
        this.westlumi7.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.westluminescent.addChild(westlumi7);
        this.westlumi7.cubeList.add(new ModelBox(westlumi7, 18, 23, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westluminescent2 = new AdvancedModelRenderer(this);
        this.westluminescent2.setRotationPoint(2.025F, 0.0F, 1.0F);
        this.main.addChild(westluminescent2);


        this.westlumi8 = new AdvancedModelRenderer(this);
        this.westlumi8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.westluminescent2.addChild(westlumi8);
        this.westlumi8.cubeList.add(new ModelBox(westlumi8, 9, 23, 1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi9 = new AdvancedModelRenderer(this);
        this.westlumi9.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.westluminescent2.addChild(westlumi9);
        this.westlumi9.cubeList.add(new ModelBox(westlumi9, 6, 23, 1.0F, 0.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi10 = new AdvancedModelRenderer(this);
        this.westlumi10.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.westluminescent2.addChild(westlumi10);
        this.westlumi10.cubeList.add(new ModelBox(westlumi10, 3, 23, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi11 = new AdvancedModelRenderer(this);
        this.westlumi11.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.westluminescent2.addChild(westlumi11);
        this.westlumi11.cubeList.add(new ModelBox(westlumi11, 0, 23, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi12 = new AdvancedModelRenderer(this);
        this.westlumi12.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.westluminescent2.addChild(westlumi12);
        this.westlumi12.cubeList.add(new ModelBox(westlumi12, 21, 21, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi13 = new AdvancedModelRenderer(this);
        this.westlumi13.setRotationPoint(0.975F, -6.0F, -2.5F);
        this.westluminescent2.addChild(westlumi13);
        this.westlumi13.cubeList.add(new ModelBox(westlumi13, 21, 18, 0.025F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.westlumi14 = new AdvancedModelRenderer(this);
        this.westlumi14.setRotationPoint(0.975F, -7.0F, -2.5F);
        this.westluminescent2.addChild(westlumi14);
        this.westlumi14.cubeList.add(new ModelBox(westlumi14, 20, 15, 0.025F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.westluminescent3 = new AdvancedModelRenderer(this);
        this.westluminescent3.setRotationPoint(2.025F, 0.0F, 2.5F);
        this.main.addChild(westluminescent3);


        this.westlumi15 = new AdvancedModelRenderer(this);
        this.westlumi15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.westluminescent3.addChild(westlumi15);
        this.westlumi15.cubeList.add(new ModelBox(westlumi15, 9, 23, 1.0F, -1.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi16 = new AdvancedModelRenderer(this);
        this.westlumi16.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.westluminescent3.addChild(westlumi16);
        this.westlumi16.cubeList.add(new ModelBox(westlumi16, 6, 23, 1.0F, 0.0F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi17 = new AdvancedModelRenderer(this);
        this.westlumi17.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.westluminescent3.addChild(westlumi17);
        this.westlumi17.cubeList.add(new ModelBox(westlumi17, 3, 23, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi18 = new AdvancedModelRenderer(this);
        this.westlumi18.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.westluminescent3.addChild(westlumi18);
        this.westlumi18.cubeList.add(new ModelBox(westlumi18, 0, 23, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi19 = new AdvancedModelRenderer(this);
        this.westlumi19.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.westluminescent3.addChild(westlumi19);
        this.westlumi19.cubeList.add(new ModelBox(westlumi19, 21, 21, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi20 = new AdvancedModelRenderer(this);
        this.westlumi20.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.westluminescent3.addChild(westlumi20);
        this.westlumi20.cubeList.add(new ModelBox(westlumi20, 21, 18, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));

        this.westlumi21 = new AdvancedModelRenderer(this);
        this.westlumi21.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.westluminescent3.addChild(westlumi21);
        this.westlumi21.cubeList.add(new ModelBox(westlumi21, 20, 15, 1.0F, 0.5F, -3.0F, 0, 1, 1, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);

    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        EntityPrehistoricFloraCtenorhabdotus entityCtenorhabdotus = (EntityPrehistoricFloraCtenorhabdotus) e;
//        this.main.offsetY = 0.0F;
//        this.Armbase.scaleChildren = false;
//        this.Armbase.setScaleY(1.0F);
//        this.Armbase2.scaleChildren = false;
//        this.Armbase2.setScaleY(1.0F);
//        this.Armbase3.scaleChildren = false;
//        this.Armbase3.setScaleY(1.0F);
//        this.Armbase4.scaleChildren = false;
//        this.Armbase4.setScaleY(1.0F);
//        this.Armbase5.scaleChildren = false;
//        this.Armbase5.setScaleY(1.0F);

//        if (entityCtenorhabdotus.isReallyInWater()) {
//            this.bob(Base, 0.2F, 2.5F, false, f2, 1);
//        }
//        else {
//            this.resetToDefaultPose();
//            //this.Base.rotateAngleZ = (float) Math.toRadians(90);
//            this.Base.offsetY = -0.05F;
//            this.Armbase.scaleChildren = true;
//            this.Armbase.setScaleY(0.1F);
//            this.Armbase2.scaleChildren = true;
//            this.Armbase2.setScaleY(0.1F);
//            this.Armbase3.scaleChildren = true;
//            this.Armbase3.setScaleY(0.1F);
//            this.Armbase4.scaleChildren = true;
//            this.Armbase4.setScaleY(0.1F);
//            this.Armbase5.scaleChildren = true;
//            this.Armbase5.setScaleY(0.1F);
//        }

    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);        this.resetToDefaultPose();
        EntityPrehistoricFloraCtenorhabdotus ee = (EntityPrehistoricFloraCtenorhabdotus) entitylivingbaseIn;
        if (ee.isReallyInWater()) {
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCtenorhabdotus entity = (EntityPrehistoricFloraCtenorhabdotus) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.westlumi.rotationPointX = this.westlumi.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*0.05);
        this.westlumi.rotationPointY = this.westlumi.rotationPointY - (float)(0);
        this.westlumi.rotationPointZ = this.westlumi.rotationPointZ + (float)(0);


        this.westlumi2.rotationPointX = this.westlumi2.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*0.05);
        this.westlumi2.rotationPointY = this.westlumi2.rotationPointY - (float)(0);
        this.westlumi2.rotationPointZ = this.westlumi2.rotationPointZ + (float)(0);


        this.westlumi3.rotationPointX = this.westlumi3.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-210))*0.05);
        this.westlumi3.rotationPointY = this.westlumi3.rotationPointY - (float)(0);
        this.westlumi3.rotationPointZ = this.westlumi3.rotationPointZ + (float)(0);


        this.westlumi4.rotationPointX = this.westlumi4.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.05);
        this.westlumi4.rotationPointY = this.westlumi4.rotationPointY - (float)(0);
        this.westlumi4.rotationPointZ = this.westlumi4.rotationPointZ + (float)(0);


        this.westlumi5.rotationPointX = this.westlumi5.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.05);
        this.westlumi5.rotationPointY = this.westlumi5.rotationPointY - (float)(0);
        this.westlumi5.rotationPointZ = this.westlumi5.rotationPointZ + (float)(0);


        this.westlumi6.rotationPointX = this.westlumi6.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.05);
        this.westlumi6.rotationPointY = this.westlumi6.rotationPointY - (float)(0);
        this.westlumi6.rotationPointZ = this.westlumi6.rotationPointZ + (float)(0);


        this.westlumi7.rotationPointX = this.westlumi7.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.05);
        this.westlumi7.rotationPointY = this.westlumi7.rotationPointY - (float)(0);
        this.westlumi7.rotationPointZ = this.westlumi7.rotationPointZ + (float)(0);


        this.westlumi8.rotationPointX = this.westlumi8.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-270))*0.05);
        this.westlumi8.rotationPointY = this.westlumi8.rotationPointY - (float)(0);
        this.westlumi8.rotationPointZ = this.westlumi8.rotationPointZ + (float)(0);


        this.westlumi9.rotationPointX = this.westlumi9.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-240))*0.05);
        this.westlumi9.rotationPointY = this.westlumi9.rotationPointY - (float)(0);
        this.westlumi9.rotationPointZ = this.westlumi9.rotationPointZ + (float)(0);


        this.westlumi10.rotationPointX = this.westlumi10.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-210))*0.05);
        this.westlumi10.rotationPointY = this.westlumi10.rotationPointY - (float)(0);
        this.westlumi10.rotationPointZ = this.westlumi10.rotationPointZ + (float)(0);


        this.westlumi11.rotationPointX = this.westlumi11.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.05);
        this.westlumi11.rotationPointY = this.westlumi11.rotationPointY - (float)(0);
        this.westlumi11.rotationPointZ = this.westlumi11.rotationPointZ + (float)(0);


        this.westlumi12.rotationPointX = this.westlumi12.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.05);
        this.westlumi12.rotationPointY = this.westlumi12.rotationPointY - (float)(0);
        this.westlumi12.rotationPointZ = this.westlumi12.rotationPointZ + (float)(0);


        this.westlumi13.rotationPointX = this.westlumi13.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.05);
        this.westlumi13.rotationPointY = this.westlumi13.rotationPointY - (float)(0);
        this.westlumi13.rotationPointZ = this.westlumi13.rotationPointZ + (float)(0);


        this.westlumi14.rotationPointX = this.westlumi14.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.05);
        this.westlumi14.rotationPointY = this.westlumi14.rotationPointY - (float)(0);
        this.westlumi14.rotationPointZ = this.westlumi14.rotationPointZ + (float)(0);


        this.westlumi15.rotationPointX = this.westlumi15.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.05);
        this.westlumi15.rotationPointY = this.westlumi15.rotationPointY - (float)(0);
        this.westlumi15.rotationPointZ = this.westlumi15.rotationPointZ + (float)(0);


        this.westlumi16.rotationPointX = this.westlumi16.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.05);
        this.westlumi16.rotationPointY = this.westlumi16.rotationPointY - (float)(0);
        this.westlumi16.rotationPointZ = this.westlumi16.rotationPointZ + (float)(0);


        this.westlumi17.rotationPointX = this.westlumi17.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.05);
        this.westlumi17.rotationPointY = this.westlumi17.rotationPointY - (float)(0);
        this.westlumi17.rotationPointZ = this.westlumi17.rotationPointZ + (float)(0);


        this.westlumi18.rotationPointX = this.westlumi18.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05);
        this.westlumi18.rotationPointY = this.westlumi18.rotationPointY - (float)(0);
        this.westlumi18.rotationPointZ = this.westlumi18.rotationPointZ + (float)(0);


        this.westlumi19.rotationPointX = this.westlumi19.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.05);
        this.westlumi19.rotationPointY = this.westlumi19.rotationPointY - (float)(0);
        this.westlumi19.rotationPointZ = this.westlumi19.rotationPointZ + (float)(0);


        this.westlumi20.rotationPointX = this.westlumi20.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05);
        this.westlumi20.rotationPointY = this.westlumi20.rotationPointY - (float)(0);
        this.westlumi20.rotationPointZ = this.westlumi20.rotationPointZ + (float)(0);


        this.westlumi21.rotationPointX = this.westlumi21.rotationPointX + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*0.05);
        this.westlumi21.rotationPointY = this.westlumi21.rotationPointY - (float)(0);
        this.westlumi21.rotationPointZ = this.westlumi21.rotationPointZ + (float)(0);


        this.eastlumi15.rotationPointX = this.eastlumi15.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.05);
        this.eastlumi15.rotationPointY = this.eastlumi15.rotationPointY - (float)(0);
        this.eastlumi15.rotationPointZ = this.eastlumi15.rotationPointZ + (float)(0);


        this.eastlumi16.rotationPointX = this.eastlumi16.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.05);
        this.eastlumi16.rotationPointY = this.eastlumi16.rotationPointY - (float)(0);
        this.eastlumi16.rotationPointZ = this.eastlumi16.rotationPointZ + (float)(0);


        this.eastlumi17.rotationPointX = this.eastlumi17.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.05);
        this.eastlumi17.rotationPointY = this.eastlumi17.rotationPointY - (float)(0);
        this.eastlumi17.rotationPointZ = this.eastlumi17.rotationPointZ + (float)(0);


        this.eastlumi18.rotationPointX = this.eastlumi18.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05);
        this.eastlumi18.rotationPointY = this.eastlumi18.rotationPointY - (float)(0);
        this.eastlumi18.rotationPointZ = this.eastlumi18.rotationPointZ + (float)(0);


        this.eastlumi19.rotationPointX = this.eastlumi19.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.05);
        this.eastlumi19.rotationPointY = this.eastlumi19.rotationPointY - (float)(0);
        this.eastlumi19.rotationPointZ = this.eastlumi19.rotationPointZ + (float)(0);


        this.eastlumi20.rotationPointX = this.eastlumi20.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*0.05);
        this.eastlumi20.rotationPointY = this.eastlumi20.rotationPointY - (float)(0);
        this.eastlumi20.rotationPointZ = this.eastlumi20.rotationPointZ + (float)(0);


        this.eastlumi21.rotationPointX = this.eastlumi21.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*0.05);
        this.eastlumi21.rotationPointY = this.eastlumi21.rotationPointY - (float)(0);
        this.eastlumi21.rotationPointZ = this.eastlumi21.rotationPointZ + (float)(0);


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-90))*10), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*10), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*-10));
        this.main.rotationPointX = this.main.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*0.5);
        this.main.rotationPointY = this.main.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+90))*1);
        this.main.setScale((float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*0.1),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+90))*-0.1),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*0.1));


        this.jellypart.setScale((float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*0.05),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-0.1),(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-30))*0.05));


        this.southlumi.rotationPointX = this.southlumi.rotationPointX + (float)(0);
        this.southlumi.rotationPointY = this.southlumi.rotationPointY - (float)(0);
        this.southlumi.rotationPointZ = this.southlumi.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.05);


        this.southlumi2.rotationPointX = this.southlumi2.rotationPointX + (float)(0);
        this.southlumi2.rotationPointY = this.southlumi2.rotationPointY - (float)(0);
        this.southlumi2.rotationPointZ = this.southlumi2.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.05);


        this.southlumi3.rotationPointX = this.southlumi3.rotationPointX + (float)(0);
        this.southlumi3.rotationPointY = this.southlumi3.rotationPointY - (float)(0);
        this.southlumi3.rotationPointZ = this.southlumi3.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.05);


        this.southlumi4.rotationPointX = this.southlumi4.rotationPointX + (float)(0);
        this.southlumi4.rotationPointY = this.southlumi4.rotationPointY - (float)(0);
        this.southlumi4.rotationPointZ = this.southlumi4.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);


        this.southlumi5.rotationPointX = this.southlumi5.rotationPointX + (float)(0);
        this.southlumi5.rotationPointY = this.southlumi5.rotationPointY - (float)(0);
        this.southlumi5.rotationPointZ = this.southlumi5.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05);


        this.southlumi6.rotationPointX = this.southlumi6.rotationPointX + (float)(0);
        this.southlumi6.rotationPointY = this.southlumi6.rotationPointY - (float)(0);
        this.southlumi6.rotationPointZ = this.southlumi6.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.05);


        this.southlumi7.rotationPointX = this.southlumi7.rotationPointX + (float)(0);
        this.southlumi7.rotationPointY = this.southlumi7.rotationPointY - (float)(0);
        this.southlumi7.rotationPointZ = this.southlumi7.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-0.05);


        this.southlumi8.rotationPointX = this.southlumi8.rotationPointX + (float)(0);
        this.southlumi8.rotationPointY = this.southlumi8.rotationPointY - (float)(0);
        this.southlumi8.rotationPointZ = this.southlumi8.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.05);


        this.southlumi9.rotationPointX = this.southlumi9.rotationPointX + (float)(0);
        this.southlumi9.rotationPointY = this.southlumi9.rotationPointY - (float)(0);
        this.southlumi9.rotationPointZ = this.southlumi9.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.05);


        this.southlumi10.rotationPointX = this.southlumi10.rotationPointX + (float)(0);
        this.southlumi10.rotationPointY = this.southlumi10.rotationPointY - (float)(0);
        this.southlumi10.rotationPointZ = this.southlumi10.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.05);


        this.southlumi11.rotationPointX = this.southlumi11.rotationPointX + (float)(0);
        this.southlumi11.rotationPointY = this.southlumi11.rotationPointY - (float)(0);
        this.southlumi11.rotationPointZ = this.southlumi11.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);


        this.southlumi12.rotationPointX = this.southlumi12.rotationPointX + (float)(0);
        this.southlumi12.rotationPointY = this.southlumi12.rotationPointY - (float)(0);
        this.southlumi12.rotationPointZ = this.southlumi12.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05);


        this.southlumi13.rotationPointX = this.southlumi13.rotationPointX + (float)(0);
        this.southlumi13.rotationPointY = this.southlumi13.rotationPointY - (float)(0);
        this.southlumi13.rotationPointZ = this.southlumi13.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.05);


        this.southlumi14.rotationPointX = this.southlumi14.rotationPointX + (float)(0);
        this.southlumi14.rotationPointY = this.southlumi14.rotationPointY - (float)(0);
        this.southlumi14.rotationPointZ = this.southlumi14.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-0.05);


        this.southlumi15.rotationPointX = this.southlumi15.rotationPointX + (float)(0);
        this.southlumi15.rotationPointY = this.southlumi15.rotationPointY - (float)(0);
        this.southlumi15.rotationPointZ = this.southlumi15.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-0.05);


        this.southlumi16.rotationPointX = this.southlumi16.rotationPointX + (float)(0);
        this.southlumi16.rotationPointY = this.southlumi16.rotationPointY - (float)(0);
        this.southlumi16.rotationPointZ = this.southlumi16.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-0.05);


        this.southlumi17.rotationPointX = this.southlumi17.rotationPointX + (float)(0);
        this.southlumi17.rotationPointY = this.southlumi17.rotationPointY - (float)(0);
        this.southlumi17.rotationPointZ = this.southlumi17.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.05);


        this.southlumi18.rotationPointX = this.southlumi18.rotationPointX + (float)(0);
        this.southlumi18.rotationPointY = this.southlumi18.rotationPointY - (float)(0);
        this.southlumi18.rotationPointZ = this.southlumi18.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.05);


        this.southlumi19.rotationPointX = this.southlumi19.rotationPointX + (float)(0);
        this.southlumi19.rotationPointY = this.southlumi19.rotationPointY - (float)(0);
        this.southlumi19.rotationPointZ = this.southlumi19.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.05);


        this.southlumi20.rotationPointX = this.southlumi20.rotationPointX + (float)(0);
        this.southlumi20.rotationPointY = this.southlumi20.rotationPointY - (float)(0);
        this.southlumi20.rotationPointZ = this.southlumi20.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.05);


        this.southlumi21.rotationPointX = this.southlumi21.rotationPointX + (float)(0);
        this.southlumi21.rotationPointY = this.southlumi21.rotationPointY - (float)(0);
        this.southlumi21.rotationPointZ = this.southlumi21.rotationPointZ + (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);


        this.northlumi.rotationPointX = this.northlumi.rotationPointX + (float)(0);
        this.northlumi.rotationPointY = this.northlumi.rotationPointY - (float)(0);
        this.northlumi.rotationPointZ = this.northlumi.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-0.05);


        this.northlumi2.rotationPointX = this.northlumi2.rotationPointX + (float)(0);
        this.northlumi2.rotationPointY = this.northlumi2.rotationPointY - (float)(0);
        this.northlumi2.rotationPointZ = this.northlumi2.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-0.05);


        this.northlumi3.rotationPointX = this.northlumi3.rotationPointX + (float)(0);
        this.northlumi3.rotationPointY = this.northlumi3.rotationPointY - (float)(0);
        this.northlumi3.rotationPointZ = this.northlumi3.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.05);


        this.northlumi4.rotationPointX = this.northlumi4.rotationPointX + (float)(0);
        this.northlumi4.rotationPointY = this.northlumi4.rotationPointY - (float)(0);
        this.northlumi4.rotationPointZ = this.northlumi4.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.05);


        this.northlumi5.rotationPointX = this.northlumi5.rotationPointX + (float)(0);
        this.northlumi5.rotationPointY = this.northlumi5.rotationPointY - (float)(0);
        this.northlumi5.rotationPointZ = this.northlumi5.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.05);


        this.northlumi6.rotationPointX = this.northlumi6.rotationPointX + (float)(0);
        this.northlumi6.rotationPointY = this.northlumi6.rotationPointY - (float)(0);
        this.northlumi6.rotationPointZ = this.northlumi6.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.05);


        this.northlumi7.rotationPointX = this.northlumi7.rotationPointX + (float)(0);
        this.northlumi7.rotationPointY = this.northlumi7.rotationPointY - (float)(0);
        this.northlumi7.rotationPointZ = this.northlumi7.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);


        this.northlumi8.rotationPointX = this.northlumi8.rotationPointX + (float)(0);
        this.northlumi8.rotationPointY = this.northlumi8.rotationPointY - (float)(0);
        this.northlumi8.rotationPointZ = this.northlumi8.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*-0.05);


        this.northlumi9.rotationPointX = this.northlumi9.rotationPointX + (float)(0);
        this.northlumi9.rotationPointY = this.northlumi9.rotationPointY - (float)(0);
        this.northlumi9.rotationPointZ = this.northlumi9.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-0.05);


        this.northlumi10.rotationPointX = this.northlumi10.rotationPointX + (float)(0);
        this.northlumi10.rotationPointY = this.northlumi10.rotationPointY - (float)(0);
        this.northlumi10.rotationPointZ = this.northlumi10.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.05);


        this.northlumi11.rotationPointX = this.northlumi11.rotationPointX + (float)(0);
        this.northlumi11.rotationPointY = this.northlumi11.rotationPointY - (float)(0);
        this.northlumi11.rotationPointZ = this.northlumi11.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.05);


        this.northlumi12.rotationPointX = this.northlumi12.rotationPointX + (float)(0);
        this.northlumi12.rotationPointY = this.northlumi12.rotationPointY - (float)(0);
        this.northlumi12.rotationPointZ = this.northlumi12.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.05);


        this.northlumi13.rotationPointX = this.northlumi13.rotationPointX + (float)(0);
        this.northlumi13.rotationPointY = this.northlumi13.rotationPointY - (float)(0);
        this.northlumi13.rotationPointZ = this.northlumi13.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.05);


        this.northlumi14.rotationPointX = this.northlumi14.rotationPointX + (float)(0);
        this.northlumi14.rotationPointY = this.northlumi14.rotationPointY - (float)(0);
        this.northlumi14.rotationPointZ = this.northlumi14.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);


        this.northlumi15.rotationPointX = this.northlumi15.rotationPointX + (float)(0);
        this.northlumi15.rotationPointY = this.northlumi15.rotationPointY - (float)(0);
        this.northlumi15.rotationPointZ = this.northlumi15.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.05);


        this.northlumi16.rotationPointX = this.northlumi16.rotationPointX + (float)(0);
        this.northlumi16.rotationPointY = this.northlumi16.rotationPointY - (float)(0);
        this.northlumi16.rotationPointZ = this.northlumi16.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.05);


        this.northlumi17.rotationPointX = this.northlumi17.rotationPointX + (float)(0);
        this.northlumi17.rotationPointY = this.northlumi17.rotationPointY - (float)(0);
        this.northlumi17.rotationPointZ = this.northlumi17.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.05);


        this.northlumi18.rotationPointX = this.northlumi18.rotationPointX + (float)(0);
        this.northlumi18.rotationPointY = this.northlumi18.rotationPointY - (float)(0);
        this.northlumi18.rotationPointZ = this.northlumi18.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.05);


        this.northlumi19.rotationPointX = this.northlumi19.rotationPointX + (float)(0);
        this.northlumi19.rotationPointY = this.northlumi19.rotationPointY - (float)(0);
        this.northlumi19.rotationPointZ = this.northlumi19.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05);


        this.northlumi20.rotationPointX = this.northlumi20.rotationPointX + (float)(0);
        this.northlumi20.rotationPointY = this.northlumi20.rotationPointY - (float)(0);
        this.northlumi20.rotationPointZ = this.northlumi20.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-0.05);


        this.northlumi21.rotationPointX = this.northlumi21.rotationPointX + (float)(0);
        this.northlumi21.rotationPointY = this.northlumi21.rotationPointY - (float)(0);
        this.northlumi21.rotationPointZ = this.northlumi21.rotationPointZ + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-0.05);


        this.eastlumi.rotationPointX = this.eastlumi.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.05);
        this.eastlumi.rotationPointY = this.eastlumi.rotationPointY - (float)(0);
        this.eastlumi.rotationPointZ = this.eastlumi.rotationPointZ + (float)(0);


        this.eastlumi2.rotationPointX = this.eastlumi2.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.05);
        this.eastlumi2.rotationPointY = this.eastlumi2.rotationPointY - (float)(0);
        this.eastlumi2.rotationPointZ = this.eastlumi2.rotationPointZ + (float)(0);


        this.eastlumi3.rotationPointX = this.eastlumi3.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.05);
        this.eastlumi3.rotationPointY = this.eastlumi3.rotationPointY - (float)(0);
        this.eastlumi3.rotationPointZ = this.eastlumi3.rotationPointZ + (float)(0);


        this.eastlumi4.rotationPointX = this.eastlumi4.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.05);
        this.eastlumi4.rotationPointY = this.eastlumi4.rotationPointY - (float)(0);
        this.eastlumi4.rotationPointZ = this.eastlumi4.rotationPointZ + (float)(0);


        this.eastlumi5.rotationPointX = this.eastlumi5.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.05);
        this.eastlumi5.rotationPointY = this.eastlumi5.rotationPointY - (float)(0);
        this.eastlumi5.rotationPointZ = this.eastlumi5.rotationPointZ + (float)(0);


        this.eastlumi6.rotationPointX = this.eastlumi6.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.05);
        this.eastlumi6.rotationPointY = this.eastlumi6.rotationPointY - (float)(0);
        this.eastlumi6.rotationPointZ = this.eastlumi6.rotationPointZ + (float)(0);


        this.eastlumi7.rotationPointX = this.eastlumi7.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05);
        this.eastlumi7.rotationPointY = this.eastlumi7.rotationPointY - (float)(0);
        this.eastlumi7.rotationPointZ = this.eastlumi7.rotationPointZ + (float)(0);


        this.eastlumi8.rotationPointX = this.eastlumi8.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.05);
        this.eastlumi8.rotationPointY = this.eastlumi8.rotationPointY - (float)(0);
        this.eastlumi8.rotationPointZ = this.eastlumi8.rotationPointZ + (float)(0);


        this.eastlumi9.rotationPointX = this.eastlumi9.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.05);
        this.eastlumi9.rotationPointY = this.eastlumi9.rotationPointY - (float)(0);
        this.eastlumi9.rotationPointZ = this.eastlumi9.rotationPointZ + (float)(0);


        this.eastlumi10.rotationPointX = this.eastlumi10.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.05);
        this.eastlumi10.rotationPointY = this.eastlumi10.rotationPointY - (float)(0);
        this.eastlumi10.rotationPointZ = this.eastlumi10.rotationPointZ + (float)(0);


        this.eastlumi11.rotationPointX = this.eastlumi11.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.05);
        this.eastlumi11.rotationPointY = this.eastlumi11.rotationPointY - (float)(0);
        this.eastlumi11.rotationPointZ = this.eastlumi11.rotationPointZ + (float)(0);


        this.eastlumi12.rotationPointX = this.eastlumi12.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.05);
        this.eastlumi12.rotationPointY = this.eastlumi12.rotationPointY - (float)(0);
        this.eastlumi12.rotationPointZ = this.eastlumi12.rotationPointZ + (float)(0);


        this.eastlumi13.rotationPointX = this.eastlumi13.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*0.05);
        this.eastlumi13.rotationPointY = this.eastlumi13.rotationPointY - (float)(0);
        this.eastlumi13.rotationPointZ = this.eastlumi13.rotationPointZ + (float)(0);


        this.eastlumi14.rotationPointX = this.eastlumi14.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.05);
        this.eastlumi14.rotationPointY = this.eastlumi14.rotationPointY - (float)(0);
        this.eastlumi14.rotationPointZ = this.eastlumi14.rotationPointZ + (float)(0);
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCtenorhabdotus e = (EntityPrehistoricFloraCtenorhabdotus) entity;
        animator.update(entity);


    }
}
