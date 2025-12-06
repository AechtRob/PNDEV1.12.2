package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatysuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlatysuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Headtop_r1;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Lefteye_r1;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Leftuppercheek;
    private final AdvancedModelRenderer Rightuppercheek;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Leftmasseter;
    private final AdvancedModelRenderer Rightmasseter;
    private final AdvancedModelRenderer Upperjawbase2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Leftuppercheek2;
    private final AdvancedModelRenderer Rightuppercheek2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Headtop;
    private final AdvancedModelRenderer Neckscutes;
    private final AdvancedModelRenderer Throatpouchfront;
    private final AdvancedModelRenderer Throatpouchback;
    private final AdvancedModelRenderer Bodyfrontscutes;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Bodymiddlescutes;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailflukeend;
    private final AdvancedModelRenderer Tailflukebase;
    private final AdvancedModelRenderer Tailmiddlescutes;
    private final AdvancedModelRenderer Tailmiddlescutesend;
    private final AdvancedModelRenderer Tailmiddlebasescutes;
    private final AdvancedModelRenderer Tailmiddlebasescutes_r1;
    private final AdvancedModelRenderer Tailbasescutes;
    private final AdvancedModelRenderer Hipscutes;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfootheel;
    private final AdvancedModelRenderer Lefthindfoottoes;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfootheel;
    private final AdvancedModelRenderer Righthindfoottoes;

    private ModelAnimator animator;

    public ModelPlatysuchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.5F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 17.1F, 9.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0848F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 31, 38, -3.5F, -1.5F, -5.0F, 7, 6, 7, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.2F, -4.3F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.0637F, 0.0F, 0.0F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -5.0F, -1.5F, -10.0F, 10, 7, 10, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3F, -9.3F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1274F, 0.0F, 0.0F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 18, -4.5F, -1.0F, -7.0F, 9, 6, 7, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.4F, -5.5F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.1911F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 0, 32, -3.5F, -1.0F, -7.5F, 7, 5, 8, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -6.7F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1911F, 0.0F, 0.0F);


        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, -0.1061F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 76, 8, -1.5F, 0.418F, -7.8716F, 3, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.418F, -7.8716F);
        this.Upperjawbase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2531F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 75, -1.5F, 0.0F, 0.0F, 3, 1, 5, -0.001F, false));

        this.Headtop_r1 = new AdvancedModelRenderer(this);
        this.Headtop_r1.setRotationPoint(0.0F, -0.582F, -3.0716F);
        this.Upperjawbase.addChild(Headtop_r1);
        this.setRotateAngle(Headtop_r1, 0.1134F, 0.0F, 0.0F);
        this.Headtop_r1.cubeList.add(new ModelBox(Headtop_r1, 70, 68, -2.5F, -0.2403F, -0.4523F, 5, 2, 4, 0.0F, false));
        this.Headtop_r1.cubeList.add(new ModelBox(Headtop_r1, 67, 43, -3.0F, 0.9097F, -1.3273F, 6, 1, 5, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-0.6F, 0.068F, -5.3716F);
        this.Upperjawbase.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.1911F, -0.3344F, 0.1911F);


        this.Lefteye_r1 = new AdvancedModelRenderer(this);
        this.Lefteye_r1.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.Lefteye.addChild(Lefteye_r1);
        this.setRotateAngle(Lefteye_r1, 0.1309F, 0.0F, 0.0F);
        this.Lefteye_r1.cubeList.add(new ModelBox(Lefteye_r1, 0, 46, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, false));

        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(1.1287F, 0.256F, -3.9805F);
        this.Upperjawbase.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0166F, 0.3344F, -0.1911F);
        this.Righteye.cubeList.add(new ModelBox(Righteye, 0, 46, -1.0F, -1.0F, -1.5F, 2, 2, 3, 0.0F, true));

        this.Leftuppercheek = new AdvancedModelRenderer(this);
        this.Leftuppercheek.setRotationPoint(-1.5F, 0.388F, -7.5716F);
        this.Upperjawbase.addChild(Leftuppercheek);
        this.setRotateAngle(Leftuppercheek, -0.0175F, -0.3609F, 0.0F);
        this.Leftuppercheek.cubeList.add(new ModelBox(Leftuppercheek, 0, 71, 0.0F, 0.0F, -2.0F, 2, 1, 6, 0.0F, false));
        this.Leftuppercheek.cubeList.add(new ModelBox(Leftuppercheek, 0, 59, 0.25F, 0.75F, -1.0F, 0, 1, 4, 0.0F, false));

        this.Rightuppercheek = new AdvancedModelRenderer(this);
        this.Rightuppercheek.setRotationPoint(1.5F, 0.388F, -7.5716F);
        this.Upperjawbase.addChild(Rightuppercheek);
        this.setRotateAngle(Rightuppercheek, -0.0175F, 0.3609F, 0.0F);
        this.Rightuppercheek.cubeList.add(new ModelBox(Rightuppercheek, 0, 71, -2.0F, 0.0F, -2.0F, 2, 1, 6, 0.0F, true));
        this.Rightuppercheek.cubeList.add(new ModelBox(Rightuppercheek, 0, 59, -0.25F, 0.75F, -1.0F, 0, 1, 4, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 1.418F, -7.8716F);
        this.Upperjawbase.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 46, 18, -1.0F, -1.0F, -10.0F, 2, 1, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.0F, -5.5F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 59, 0.0F, -0.25F, -4.5F, 0, 1, 10, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, -5.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 59, 0.0F, -0.25F, -4.5F, 0, 1, 10, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.bone.addChild(bone2);
        this.setRotateAngle(bone2, 0.2182F, 0.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 41, 8, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 1.0F, -1.0F);
        this.bone2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 18, 0.0F, -0.25F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 1.0F, -1.0F);
        this.bone2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 18, 0.0F, -0.25F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Lowerjawback);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 46, 56, -3.0F, 0.0F, -5.0F, 6, 2, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Lowerjawback.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 59, -2.5F, -1.0F, 0.0F, 5, 1, 4, 0.001F, false));

        this.Leftmasseter = new AdvancedModelRenderer(this);
        this.Leftmasseter.setRotationPoint(-1.9F, 0.0F, -5.0F);
        this.Lowerjawback.addChild(Leftmasseter);
        this.setRotateAngle(Leftmasseter, -0.5283F, -0.0848F, 0.1274F);
        this.Leftmasseter.cubeList.add(new ModelBox(Leftmasseter, 70, 26, 0.0F, -2.5F, 0.0F, 3, 3, 5, 0.0F, false));

        this.Rightmasseter = new AdvancedModelRenderer(this);
        this.Rightmasseter.setRotationPoint(1.9F, 0.0F, -5.0F);
        this.Lowerjawback.addChild(Rightmasseter);
        this.setRotateAngle(Rightmasseter, -0.5283F, 0.0848F, -0.1274F);
        this.Rightmasseter.cubeList.add(new ModelBox(Rightmasseter, 70, 26, -3.0F, -2.5F, 0.0F, 3, 3, 5, 0.0F, true));

        this.Upperjawbase2 = new AdvancedModelRenderer(this);
        this.Upperjawbase2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjawback.addChild(Upperjawbase2);
        this.setRotateAngle(Upperjawbase2, -0.1061F, 0.0F, 0.0F);
        this.Upperjawbase2.cubeList.add(new ModelBox(Upperjawbase2, 66, 75, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.Upperjawbase2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 7, -1.5F, -1.0F, 3.325F, 3, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 46, -1.5F, -1.0F, 0.0F, 3, 1, 4, -0.001F, false));

        this.Leftuppercheek2 = new AdvancedModelRenderer(this);
        this.Leftuppercheek2.setRotationPoint(-1.5F, -0.03F, -3.7F);
        this.Upperjawbase2.addChild(Leftuppercheek2);
        this.setRotateAngle(Leftuppercheek2, -0.0175F, -0.3609F, 0.0F);
        this.Leftuppercheek2.cubeList.add(new ModelBox(Leftuppercheek2, 28, 65, 0.0F, 0.0F, -2.0F, 2, 1, 6, 0.0F, false));
        this.Leftuppercheek2.cubeList.add(new ModelBox(Leftuppercheek2, 54, 0, 0.25F, -0.75F, -1.0F, 0, 1, 4, 0.0F, false));

        this.Rightuppercheek2 = new AdvancedModelRenderer(this);
        this.Rightuppercheek2.setRotationPoint(1.5F, -0.03F, -3.7F);
        this.Upperjawbase2.addChild(Rightuppercheek2);
        this.setRotateAngle(Rightuppercheek2, -0.0175F, 0.3609F, 0.0F);
        this.Rightuppercheek2.cubeList.add(new ModelBox(Rightuppercheek2, 28, 65, -2.0F, 0.0F, -2.0F, 2, 1, 6, 0.0F, true));
        this.Rightuppercheek2.cubeList.add(new ModelBox(Rightuppercheek2, 54, 0, -0.25F, -0.75F, -1.0F, 0, 1, 4, 0.0F, true));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Upperjawbase2.addChild(bone3);
        this.setRotateAngle(bone3, -0.0436F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 46, -1.0F, 0.0F, -10.0F, 2, 1, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 0.0F, -5.5F);
        this.bone3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 61, 56, 0.0F, -0.75F, -4.5F, 0, 1, 10, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, -5.5F);
        this.bone3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 61, 56, 0.0F, -0.75F, -4.5F, 0, 1, 10, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.2182F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 52, -1.0F, 1.0F, -2.0F, 2, 1, 2, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 1.0F, -1.0F);
        this.bone4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 1.0F, -1.0F);
        this.bone4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Headtop = new AdvancedModelRenderer(this);
        this.Headtop.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.Head.addChild(Headtop);


        this.Neckscutes = new AdvancedModelRenderer(this);
        this.Neckscutes.setRotationPoint(-0.01F, -0.4F, 0.0F);
        this.Neck.addChild(Neckscutes);


        this.Throatpouchfront = new AdvancedModelRenderer(this);
        this.Throatpouchfront.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.Neck.addChild(Throatpouchfront);
        this.setRotateAngle(Throatpouchfront, -0.3396F, 0.0F, 0.0F);
        this.Throatpouchfront.cubeList.add(new ModelBox(Throatpouchfront, 72, 52, -2.5F, -2.0F, 0.0F, 5, 2, 4, 0.0F, false));

        this.Throatpouchback = new AdvancedModelRenderer(this);
        this.Throatpouchback.setRotationPoint(0.01F, 0.0F, 4.0F);
        this.Throatpouchfront.addChild(Throatpouchback);
        this.setRotateAngle(Throatpouchback, 0.5519F, 0.0F, 0.0F);
        this.Throatpouchback.cubeList.add(new ModelBox(Throatpouchback, 31, 0, -2.51F, -2.0F, 0.0F, 5, 2, 5, 0.001F, false));

        this.Bodyfrontscutes = new AdvancedModelRenderer(this);
        this.Bodyfrontscutes.setRotationPoint(0.0F, -0.5F, 0.0F);
        this.Bodyfront.addChild(Bodyfrontscutes);


        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.5F, 3.5F, -5.5F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.2335F, -0.8915F, -0.0213F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 38, 52, -1.0F, -1.0F, -0.5F, 2, 2, 4, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.1911F, 0.8915F, 0.2335F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 0, -0.9F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(-0.4F, 3.5F, -0.5F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.1061F, 0.2335F, -0.2759F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 46, 24, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.5F, 3.5F, -5.5F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.2335F, 0.8915F, 0.0213F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 38, 52, -1.0F, -1.0F, -0.5F, 2, 2, 4, 0.0F, true));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.1911F, -0.8915F, -0.2335F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 0, -1.1F, 0.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.4F, 3.5F, -0.5F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.1061F, -0.2335F, 0.2759F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 46, 24, -1.0F, 0.0F, -2.5F, 2, 1, 3, 0.0F, true));

        this.Bodymiddlescutes = new AdvancedModelRenderer(this);
        this.Bodymiddlescutes.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Bodymiddle.addChild(Bodymiddlescutes);


        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 0.2F, 1.3F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.0637F, 0.0F, 0.0F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 24, 23, -3.0F, -1.5F, 0.0F, 6, 5, 9, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.2F, 8.3F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0213F, 0.0F, 0.0F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 19, 52, -2.5F, -1.5F, 0.0F, 5, 4, 8, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.1F, 7.3F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0424F, 0.0F, 0.0F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 53, 31, -2.0F, -1.5F, 0.0F, 4, 3, 8, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.5F, 7.3F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0424F, 0.0F, 0.0F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 51, 43, -1.5F, -1.0F, 0.0F, 3, 3, 9, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.25F, 8.3F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.0213F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 54, 0, -1.0F, -1.05F, 0.0F, 2, 2, 9, 0.0F, false));

        this.Tailflukeend = new AdvancedModelRenderer(this);
        this.Tailflukeend.setRotationPoint(-0.01F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailflukeend);
        this.Tailflukeend.cubeList.add(new ModelBox(Tailflukeend, 41, 0, 0.0F, -4.05F, 0.0F, 0, 5, 12, 0.0F, false));

        this.Tailflukebase = new AdvancedModelRenderer(this);
        this.Tailflukebase.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tailmiddleend.addChild(Tailflukebase);
        this.Tailflukebase.cubeList.add(new ModelBox(Tailflukebase, 36, 65, 0.0F, -2.0F, 0.0F, 0, 2, 9, 0.0F, false));

        this.Tailmiddlescutes = new AdvancedModelRenderer(this);
        this.Tailmiddlescutes.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tailmiddle.addChild(Tailmiddlescutes);
        this.setRotateAngle(Tailmiddlescutes, 0.0637F, 0.0F, 0.0F);
        this.Tailmiddlescutes.cubeList.add(new ModelBox(Tailmiddlescutes, 46, 65, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Tailmiddlescutesend = new AdvancedModelRenderer(this);
        this.Tailmiddlescutesend.setRotationPoint(0.0F, -1.2F, 3.8F);
        this.Tailmiddle.addChild(Tailmiddlescutesend);
        this.setRotateAngle(Tailmiddlescutesend, 0.0424F, 0.0F, 0.0F);
        this.Tailmiddlescutesend.cubeList.add(new ModelBox(Tailmiddlescutesend, 46, 18, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tailmiddlebasescutes = new AdvancedModelRenderer(this);
        this.Tailmiddlebasescutes.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tailmiddlebase.addChild(Tailmiddlebasescutes);


        this.Tailmiddlebasescutes_r1 = new AdvancedModelRenderer(this);
        this.Tailmiddlebasescutes_r1.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.Tailmiddlebasescutes.addChild(Tailmiddlebasescutes_r1);
        this.setRotateAngle(Tailmiddlebasescutes_r1, 0.0436F, 0.0F, 0.0F);
        this.Tailmiddlebasescutes_r1.cubeList.add(new ModelBox(Tailmiddlebasescutes_r1, 13, 65, -1.5F, 0.0F, -8.0F, 3, 1, 8, 0.0F, false));

        this.Tailbasescutes = new AdvancedModelRenderer(this);
        this.Tailbasescutes.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Tailbase.addChild(Tailbasescutes);


        this.Hipscutes = new AdvancedModelRenderer(this);
        this.Hipscutes.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.Hips.addChild(Hipscutes);
        this.setRotateAngle(Hipscutes, -0.0424F, 0.0F, 0.0F);


        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.3F, 1.01F, -0.5F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.0213F, 0.6793F, 0.1061F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 62, 12, -2.0F, -1.5F, -6.5F, 3, 4, 7, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.3F, 0.5F, -6.1F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.1698F, -0.3396F, 0.1274F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 55, 68, -1.5F, -0.5F, -0.5F, 3, 6, 4, 0.0F, false));

        this.Lefthindfootheel = new AdvancedModelRenderer(this);
        this.Lefthindfootheel.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.Leftshin.addChild(Lefthindfootheel);
        this.setRotateAngle(Lefthindfootheel, -0.0637F, 0.0F, -0.1911F);
        this.Lefthindfootheel.cubeList.add(new ModelBox(Lefthindfootheel, 68, 0, -2.0F, 0.0F, -3.5F, 4, 1, 5, 0.0F, false));

        this.Lefthindfoottoes = new AdvancedModelRenderer(this);
        this.Lefthindfoottoes.setRotationPoint(0.0F, 0.49F, -3.5F);
        this.Lefthindfootheel.addChild(Lefthindfoottoes);
        this.Lefthindfoottoes.cubeList.add(new ModelBox(Lefthindfoottoes, 26, 18, -2.5F, -0.5F, -2.5F, 5, 1, 3, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.3F, 1.01F, -0.5F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0213F, -0.6793F, -0.1061F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 62, 12, -1.0F, -1.5F, -6.5F, 3, 4, 7, 0.0F, true));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.3F, 0.5F, -6.1F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.1698F, 0.3396F, -0.1274F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 55, 68, -1.5F, -0.5F, -0.5F, 3, 6, 4, 0.0F, true));

        this.Righthindfootheel = new AdvancedModelRenderer(this);
        this.Righthindfootheel.setRotationPoint(0.0F, 5.0F, 1.0F);
        this.Rightshin.addChild(Righthindfootheel);
        this.setRotateAngle(Righthindfootheel, -0.0637F, 0.0F, 0.1911F);
        this.Righthindfootheel.cubeList.add(new ModelBox(Righthindfootheel, 68, 0, -2.0F, 0.0F, -3.5F, 4, 1, 5, 0.0F, true));

        this.Righthindfoottoes = new AdvancedModelRenderer(this);
        this.Righthindfoottoes.setRotationPoint(0.0F, 0.49F, -3.5F);
        this.Righthindfootheel.addChild(Righthindfoottoes);
        this.Righthindfoottoes.cubeList.add(new ModelBox(Righthindfoottoes, 26, 18, -2.5F, -0.5F, -2.5F, 5, 1, 3, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.0F;
        this.root.offsetX = 0.25F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.4F, 3.6F, -0.1F);
        this.setRotateAngle(Neck, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Head, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Lowerjawback, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Rightupperarm, 0.3F, 0.8F, 0.0F);
        this.setRotateAngle(Rightlowerarm, 0.2F, -1.2F, -0.2F);
        this.setRotateAngle(Tailbase, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tailmiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, 0.2F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleX = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.105F;
        this.root.render(0.01F);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPlatysuchus entityPlatysuchus = (EntityPrehistoricFloraPlatysuchus) e;


        AdvancedModelRenderer[] Tail = {this.Tailbase, this.Tailmiddlebase, this.Tailmiddle, this.Tailmiddleend, this.Tailend};
        AdvancedModelRenderer[] Neck = {this.Neck, this.Head};
        entityPlatysuchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityPlatysuchus.getAnimation() == entityPlatysuchus.LAY_ANIMATION) {

        }
        else {
            if (!entityPlatysuchus.isReallyInWater()) {

                if (f3 == 0.0F || !entityPlatysuchus.getIsMoving()) {
                    if (entityPlatysuchus.getAnimation() != entityPlatysuchus.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityPlatysuchus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.Throatpouchfront.setScale(1,1,1);

        EntityPrehistoricFloraPlatysuchus ee = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        } else {
            //Swimming pose:
            if (!ee.getIsFast()) { //fast in water
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                //moving in water
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (-13.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -13.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10-(-13.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-15 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-10))*-15)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10 + (((tickAnim - 20) / 20) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+60))*10)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*20 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+120))*-15-(-14.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-15 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-20 + (((tickAnim - 10) / 10) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+70))*-20)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+120))*-15 + (((tickAnim - 20) / 20) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+120))*-15)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+120))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-5 + (((tickAnim - 20) / 20) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-90))*-5)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(xx), Lowerjawback.rotateAngleY + (float) Math.toRadians(yy), Lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.6-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 12) / 28) * (0-(0)));
            yy = 0.525 + (((tickAnim - 12) / 28) * (0-(0.525)));
            zz = -0.6 + (((tickAnim - 12) / 28) * (0-(-0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Throatpouchfront.rotationPointX = this.Throatpouchfront.rotationPointX + (float)(xx);
        this.Throatpouchfront.rotationPointY = this.Throatpouchfront.rotationPointY - (float)(yy);
        this.Throatpouchfront.rotationPointZ = this.Throatpouchfront.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 12) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 12) * (1.3-(1)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 12) / 28) * (1-(1)));
            yy = 1 + (((tickAnim - 12) / 28) * (1-(1)));
            zz = 1.3 + (((tickAnim - 12) / 28) * (1-(1.3)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.Throatpouchfront.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 24;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15 + (((tickAnim - 5) / 5) * (0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-160))*15)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 10) / 14) * (0-(0.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.Neck.rotationPointX = this.Neck.rotationPointX + (float)(0);
        this.Neck.rotationPointY = this.Neck.rotationPointY - (float)(0);
        this.Neck.rotationPointZ = this.Neck.rotationPointZ + (float)(1.35);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5 + (((tickAnim - 0) / 5) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+170))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*5)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*10-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+170))*-5 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5+170))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*10 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-3 + (((tickAnim - 5) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-60))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+90))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*-15 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*-15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*3 + (((tickAnim - 10) / 14) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5+100))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5 + (((tickAnim - 0) / 5) * (-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.25))*-5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20 + (((tickAnim - 5) / 5) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15-(-25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*20)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 24) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15 + (((tickAnim - 10) / 14) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+150))*15)));
            yy = 0 + (((tickAnim - 10) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Upperjawbase, Upperjawbase.rotateAngleX + (float) Math.toRadians(xx), Upperjawbase.rotateAngleY + (float) Math.toRadians(yy), Upperjawbase.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0.625 + (((tickAnim - 13) / 22) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 35) / 15) * (0-(0.625)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 7.5 + (((tickAnim - 13) / 22) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 35) / 15) * (0-(7.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 13 && tickAnim < 35) {
            xx = -6 + (((tickAnim - 13) / 22) * (-6-(-6)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjawback, Lowerjawback.rotateAngleX + (float) Math.toRadians(xx), Lowerjawback.rotateAngleY + (float) Math.toRadians(yy), Lowerjawback.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -2.75 + (((tickAnim - 10) / 28) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 38) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -7.5 + (((tickAnim - 10) / 28) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 38) / 12) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(0), Rightupperarm.rotateAngleY + (float) Math.toRadians(0), Rightupperarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(0), Rightlowerarm.rotateAngleY + (float) Math.toRadians(0), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -2.5 + (((tickAnim - 10) / 28) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = -4.75 + (((tickAnim - 13) / 22) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.75 + (((tickAnim - 35) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 5 + (((tickAnim - 13) / 22) * (5-(5)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 35) / 15) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = 4.75 + (((tickAnim - 10) / 28) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 38) / 12) * (0-(4.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(0), Leftshin.rotateAngleY + (float) Math.toRadians(0), Leftshin.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(0), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(0), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 38) {
            xx = -6 + (((tickAnim - 10) / 28) * (-6-(-6)));
            yy = 0 + (((tickAnim - 10) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 28) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 38) / 12) * (0-(-6)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 5.5 + (((tickAnim - 10) / 15) * (-7.32993-(5.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (-14.18576-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (-4.37124-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -7.32993 + (((tickAnim - 25) / 10) * (-28.39796-(-7.32993)));
            yy = -14.18576 + (((tickAnim - 25) / 10) * (-8.51145-(-14.18576)));
            zz = -4.37124 + (((tickAnim - 25) / 10) * (-2.62274-(-4.37124)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28.39796 + (((tickAnim - 35) / 15) * (0-(-28.39796)));
            yy = -8.51145 + (((tickAnim - 35) / 15) * (0-(-8.51145)));
            zz = -2.62274 + (((tickAnim - 35) / 15) * (0-(-2.62274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -35 + (((tickAnim - 0) / 10) * (0-(-35)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (-8.01977-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (-11.40448-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (-37.23083-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -8.01977 + (((tickAnim - 25) / 25) * (-35-(-8.01977)));
            yy = -11.40448 + (((tickAnim - 25) / 25) * (0-(-11.40448)));
            zz = -37.23083 + (((tickAnim - 25) / 25) * (0-(-37.23083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 34.5 + (((tickAnim - 0) / 10) * (-1.25-(34.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -1.25 + (((tickAnim - 10) / 9) * (35.68551-(-1.25)));
            yy = 0 + (((tickAnim - 10) / 9) * (28.82749-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (20.67635-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 35.68551 + (((tickAnim - 19) / 6) * (86.1394-(35.68551)));
            yy = 28.82749 + (((tickAnim - 19) / 6) * (57.60201-(28.82749)));
            zz = 20.67635 + (((tickAnim - 19) / 6) * (55.80457-(20.67635)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 86.1394 + (((tickAnim - 25) / 10) * (54.75-(86.1394)));
            yy = 57.60201 + (((tickAnim - 25) / 10) * (52.5-(57.60201)));
            zz = 55.80457 + (((tickAnim - 25) / 10) * (0-(55.80457)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 54.75 + (((tickAnim - 35) / 15) * (34.5-(54.75)));
            yy = 52.5 + (((tickAnim - 35) / 15) * (0-(52.5)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Righthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.725-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = -0.725 + (((tickAnim - 10) / 15) * (0-(-0.725)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (1.04-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (1.53-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0.32-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.04 + (((tickAnim - 30) / 5) * (-0.125-(1.04)));
            yy = 1.53 + (((tickAnim - 30) / 5) * (1.15-(1.53)));
            zz = 0.32 + (((tickAnim - 30) / 5) * (0.375-(0.32)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.125 + (((tickAnim - 35) / 15) * (0-(-0.125)));
            yy = 1.15 + (((tickAnim - 35) / 15) * (0-(1.15)));
            zz = 0.375 + (((tickAnim - 35) / 15) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(xx);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(yy);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -7 + (((tickAnim - 10) / 9) * (-28.93581-(-7)));
            yy = 0 + (((tickAnim - 10) / 9) * (13.64287-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (-4.13916-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -28.93581 + (((tickAnim - 19) / 6) * (-51.75-(-28.93581)));
            yy = 13.64287 + (((tickAnim - 19) / 6) * (0-(13.64287)));
            zz = -4.13916 + (((tickAnim - 19) / 6) * (0-(-4.13916)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -51.75 + (((tickAnim - 25) / 5) * (-5.2-(-51.75)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -5.2 + (((tickAnim - 30) / 5) * (56.6-(-5.2)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 56.6 + (((tickAnim - 35) / 9) * (-28.24-(56.6)));
            yy = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -28.24 + (((tickAnim - 44) / 6) * (0-(-28.24)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = -2 + (((tickAnim - 18) / 13) * (-2-(-2)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -2 + (((tickAnim - 31) / 19) * (0-(-2)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -0.7 + (((tickAnim - 18) / 13) * (-0.7-(-0.7)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -0.7 + (((tickAnim - 31) / 19) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(xx);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(yy);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 5.75 + (((tickAnim - 18) / 13) * (5.75-(5.75)));
            yy = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 31) / 19) * (0-(5.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 18) / 13) * (1-(1)));
            yy = -1.25 + (((tickAnim - 18) / 13) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 31) / 19) * (0-(1)));
            yy = -1.25 + (((tickAnim - 31) / 19) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(xx), Tailbase.rotateAngleY + (float) Math.toRadians(yy), Tailbase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-4-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -4 + (((tickAnim - 18) / 13) * (-4-(-4)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -4 + (((tickAnim - 31) / 19) * (0-(-4)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(xx), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(yy), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 18) / 13) * (0-(0)));
            yy = -7 + (((tickAnim - 18) / 13) * (-7-(-7)));
            zz = 0 + (((tickAnim - 18) / 13) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -7 + (((tickAnim - 31) / 19) * (0-(-7)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(xx), Tailmiddle.rotateAngleY + (float) Math.toRadians(yy), Tailmiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5.08045-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.43033-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-2.5014-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 5.08045 + (((tickAnim - 18) / 6) * (12.48014-(5.08045)));
            yy = -7.43033 + (((tickAnim - 18) / 6) * (-7.43033-(-7.43033)));
            zz = -2.5014 + (((tickAnim - 18) / 6) * (-2.5014-(-2.5014)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = 12.48014 + (((tickAnim - 24) / 7) * (5.08045-(12.48014)));
            yy = -7.43033 + (((tickAnim - 24) / 7) * (-7.43033-(-7.43033)));
            zz = -2.5014 + (((tickAnim - 24) / 7) * (-2.5014-(-2.5014)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5.08045 + (((tickAnim - 31) / 19) * (0-(5.08045)));
            yy = -7.43033 + (((tickAnim - 31) / 19) * (0-(-7.43033)));
            zz = -2.5014 + (((tickAnim - 31) / 19) * (0-(-2.5014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(xx), Tailmiddleend.rotateAngleY + (float) Math.toRadians(yy), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = -2.25 + (((tickAnim - 18) / 6) * (-12.18422-(-2.25)));
            yy = -22.25 + (((tickAnim - 18) / 6) * (-22.25-(-22.25)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.18422 + (((tickAnim - 24) / 4) * (3.31531-(-12.18422)));
            yy = -22.25 + (((tickAnim - 24) / 4) * (-22.25-(-22.25)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 3.31531 + (((tickAnim - 28) / 3) * (-2.25-(3.31531)));
            yy = -22.25 + (((tickAnim - 28) / 3) * (-22.25-(-22.25)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -2.25 + (((tickAnim - 31) / 19) * (0-(-2.25)));
            yy = -22.25 + (((tickAnim - 31) / 19) * (0-(-22.25)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(xx), Tailend.rotateAngleY + (float) Math.toRadians(yy), Tailend.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+180))*10), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*1);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-180))*1);


        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-180))*-10), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-2), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-180))*-10), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*2), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+210))*10), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-2), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-3), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -175.37136 + (((tickAnim - 0) / 12) * (-114.20072-(-175.37136)));
            yy = -4.31211 + (((tickAnim - 0) / 12) * (-23.30797-(-4.31211)));
            zz = 142.93513 + (((tickAnim - 0) / 12) * (84.1857-(142.93513)));
        }
        else if (tickAnim >= 12 && tickAnim < 26) {
            xx = -114.20072 + (((tickAnim - 12) / 14) * (-33.38089-(-114.20072)));
            yy = -23.30797 + (((tickAnim - 12) / 14) * (3.06993-(-23.30797)));
            zz = 84.1857 + (((tickAnim - 12) / 14) * (-2.01097-(84.1857)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -33.38089 + (((tickAnim - 26) / 12) * (-44.45526-(-33.38089)));
            yy = 3.06993 + (((tickAnim - 26) / 12) * (-23.85123-(3.06993)));
            zz = -2.01097 + (((tickAnim - 26) / 12) * (25.22495-(-2.01097)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -44.45526 + (((tickAnim - 38) / 12) * (-175.37136-(-44.45526)));
            yy = -23.85123 + (((tickAnim - 38) / 12) * (-4.31211-(-23.85123)));
            zz = 25.22495 + (((tickAnim - 38) / 12) * (142.93513-(25.22495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(xx), Leftupperarm.rotateAngleY + (float) Math.toRadians(yy), Leftupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 117.64319 + (((tickAnim - 0) / 26) * (112.81942-(117.64319)));
            yy = -6.53098 + (((tickAnim - 0) / 26) * (-23.59835-(-6.53098)));
            zz = -216.7651 + (((tickAnim - 0) / 26) * (-193.57567-(-216.7651)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 112.81942 + (((tickAnim - 26) / 12) * (111.71115-(112.81942)));
            yy = -23.59835 + (((tickAnim - 26) / 12) * (11.90845-(-23.59835)));
            zz = -193.57567 + (((tickAnim - 26) / 12) * (-187.87415-(-193.57567)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 111.71115 + (((tickAnim - 38) / 12) * (117.64319-(111.71115)));
            yy = 11.90845 + (((tickAnim - 38) / 12) * (-6.53098-(11.90845)));
            zz = -187.87415 + (((tickAnim - 38) / 12) * (-216.7651-(-187.87415)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(xx), Leftlowerarm.rotateAngleY + (float) Math.toRadians(yy), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 53.99428 + (((tickAnim - 0) / 26) * (62.55666-(53.99428)));
            yy = -17.221 + (((tickAnim - 0) / 26) * (-35.17379-(-17.221)));
            zz = 14.28427 + (((tickAnim - 0) / 26) * (-22.58339-(14.28427)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 62.55666 + (((tickAnim - 26) / 5) * (58.6667-(62.55666)));
            yy = -35.17379 + (((tickAnim - 26) / 5) * (-66.54886-(-35.17379)));
            zz = -22.58339 + (((tickAnim - 26) / 5) * (32.11119-(-22.58339)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 58.6667 + (((tickAnim - 31) / 7) * (55.20177-(58.6667)));
            yy = -66.54886 + (((tickAnim - 31) / 7) * (-93.95496-(-66.54886)));
            zz = 32.11119 + (((tickAnim - 31) / 7) * (58.37044-(32.11119)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 55.20177 + (((tickAnim - 38) / 12) * (53.99428-(55.20177)));
            yy = -93.95496 + (((tickAnim - 38) / 12) * (-17.221-(-93.95496)));
            zz = 58.37044 + (((tickAnim - 38) / 12) * (14.28427-(58.37044)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -35.88089 + (((tickAnim - 0) / 13) * (-44.45526-(-35.88089)));
            yy = -3.06993 + (((tickAnim - 0) / 13) * (23.85123-(-3.06993)));
            zz = 2.01097 + (((tickAnim - 0) / 13) * (-25.22495-(2.01097)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -44.45526 + (((tickAnim - 13) / 11) * (-178.12136-(-44.45526)));
            yy = 23.85123 + (((tickAnim - 13) / 11) * (4.31211-(23.85123)));
            zz = -25.22495 + (((tickAnim - 13) / 11) * (-142.93513-(-25.22495)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -178.12136 + (((tickAnim - 24) / 14) * (-71.53666-(-178.12136)));
            yy = 4.31211 + (((tickAnim - 24) / 14) * (29.18163-(4.31211)));
            zz = -142.93513 + (((tickAnim - 24) / 14) * (-42.69752-(-142.93513)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -71.53666 + (((tickAnim - 38) / 12) * (-35.88089-(-71.53666)));
            yy = 29.18163 + (((tickAnim - 38) / 12) * (-3.06993-(29.18163)));
            zz = -42.69752 + (((tickAnim - 38) / 12) * (2.01097-(-42.69752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(xx), Rightupperarm.rotateAngleY + (float) Math.toRadians(yy), Rightupperarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 112.81942 + (((tickAnim - 0) / 13) * (111.71115-(112.81942)));
            yy = 23.59835 + (((tickAnim - 0) / 13) * (-11.90845-(23.59835)));
            zz = 193.57567 + (((tickAnim - 0) / 13) * (187.87415-(193.57567)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 111.71115 + (((tickAnim - 13) / 11) * (117.64319-(111.71115)));
            yy = -11.90845 + (((tickAnim - 13) / 11) * (6.53098-(-11.90845)));
            zz = 187.87415 + (((tickAnim - 13) / 11) * (216.7651-(187.87415)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 117.64319 + (((tickAnim - 24) / 26) * (112.81942-(117.64319)));
            yy = 6.53098 + (((tickAnim - 24) / 26) * (23.59835-(6.53098)));
            zz = 216.7651 + (((tickAnim - 24) / 26) * (193.57567-(216.7651)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(xx), Rightlowerarm.rotateAngleY + (float) Math.toRadians(yy), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 88.34969 + (((tickAnim - 0) / 13) * (55.20177-(88.34969)));
            yy = 43.23166 + (((tickAnim - 0) / 13) * (93.95496-(43.23166)));
            zz = 77.92395 + (((tickAnim - 0) / 13) * (-58.37044-(77.92395)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 55.20177 + (((tickAnim - 13) / 11) * (53.99428-(55.20177)));
            yy = 93.95496 + (((tickAnim - 13) / 11) * (17.221-(93.95496)));
            zz = -58.37044 + (((tickAnim - 13) / 11) * (-14.28427-(-58.37044)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 53.99428 + (((tickAnim - 24) / 26) * (88.34969-(53.99428)));
            yy = 17.221 + (((tickAnim - 24) / 26) * (43.23166-(17.221)));
            zz = -14.28427 + (((tickAnim - 24) / 26) * (77.92395-(-14.28427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(xx), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(yy), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*1), Tailbase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*10), Tailbase.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*1), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*10), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-100))*1), Tailmiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-100))*010), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-150))*1), Tailmiddleend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*15), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-200))*1), Tailend.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-200))*15), Tailend.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 107.88569 + (((tickAnim - 0) / 4) * (94.28978-(107.88569)));
            yy = -30.51469 + (((tickAnim - 0) / 4) * (-34.78862-(-30.51469)));
            zz = 81.52306 + (((tickAnim - 0) / 4) * (82.92426-(81.52306)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 94.28978 + (((tickAnim - 4) / 9) * (59.59797-(94.28978)));
            yy = -34.78862 + (((tickAnim - 4) / 9) * (-43.33648-(-34.78862)));
            zz = 82.92426 + (((tickAnim - 4) / 9) * (85.72664-(82.92426)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 59.59797 + (((tickAnim - 13) / 10) * (26.83569-(59.59797)));
            yy = -43.33648 + (((tickAnim - 13) / 10) * (-55.47351-(-43.33648)));
            zz = 85.72664 + (((tickAnim - 13) / 10) * (58.40983-(85.72664)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 26.83569 + (((tickAnim - 23) / 12) * (82.92331-(26.83569)));
            yy = -55.47351 + (((tickAnim - 23) / 12) * (-40.83425-(-55.47351)));
            zz = 58.40983 + (((tickAnim - 23) / 12) * (57.03778-(58.40983)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 82.92331 + (((tickAnim - 35) / 6) * (94.362-(82.92331)));
            yy = -40.83425 + (((tickAnim - 35) / 6) * (-35.79179-(-40.83425)));
            zz = 57.03778 + (((tickAnim - 35) / 6) * (64.46513-(57.03778)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 94.362 + (((tickAnim - 41) / 4) * (106.69741-(94.362)));
            yy = -35.79179 + (((tickAnim - 41) / 4) * (-31.9539-(-35.79179)));
            zz = 64.46513 + (((tickAnim - 41) / 4) * (76.8709-(64.46513)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 106.69741 + (((tickAnim - 45) / 5) * (107.88569-(106.69741)));
            yy = -31.9539 + (((tickAnim - 45) / 5) * (-30.51469-(-31.9539)));
            zz = 76.8709 + (((tickAnim - 45) / 5) * (81.52306-(76.8709)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(xx), Leftthigh.rotateAngleY + (float) Math.toRadians(yy), Leftthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -52.5 + (((tickAnim - 0) / 13) * (-21.01345-(-52.5)));
            yy = 17.5 + (((tickAnim - 0) / 13) * (18.23062-(17.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (-20.73179-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -21.01345 + (((tickAnim - 13) / 10) * (-64.63428-(-21.01345)));
            yy = 18.23062 + (((tickAnim - 13) / 10) * (15.9553-(18.23062)));
            zz = -20.73179 + (((tickAnim - 13) / 10) * (-5.37732-(-20.73179)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -64.63428 + (((tickAnim - 23) / 27) * (-52.5-(-64.63428)));
            yy = 15.9553 + (((tickAnim - 23) / 27) * (17.5-(15.9553)));
            zz = -5.37732 + (((tickAnim - 23) / 27) * (0-(-5.37732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(xx), Leftshin.rotateAngleY + (float) Math.toRadians(yy), Leftshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 81.68974 + (((tickAnim - 0) / 12) * (69.44056-(81.68974)));
            yy = -12.06805 + (((tickAnim - 0) / 12) * (15.33173-(-12.06805)));
            zz = -65.71262 + (((tickAnim - 0) / 12) * (3.77607-(-65.71262)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 69.44056 + (((tickAnim - 12) / 9) * (1.26966-(69.44056)));
            yy = 15.33173 + (((tickAnim - 12) / 9) * (44.87395-(15.33173)));
            zz = 3.77607 + (((tickAnim - 12) / 9) * (-51.69635-(3.77607)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 1.26966 + (((tickAnim - 21) / 6) * (-4.18274-(1.26966)));
            yy = 44.87395 + (((tickAnim - 21) / 6) * (-5.57427-(44.87395)));
            zz = -51.69635 + (((tickAnim - 21) / 6) * (-50.63557-(-51.69635)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = -4.18274 + (((tickAnim - 27) / 6) * (-10.17546-(-4.18274)));
            yy = -5.57427 + (((tickAnim - 27) / 6) * (-7.68807-(-5.57427)));
            zz = -50.63557 + (((tickAnim - 27) / 6) * (-54.18994-(-50.63557)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -10.17546 + (((tickAnim - 33) / 6) * (0.44628-(-10.17546)));
            yy = -7.68807 + (((tickAnim - 33) / 6) * (-9.14806-(-7.68807)));
            zz = -54.18994 + (((tickAnim - 33) / 6) * (-58.03083-(-54.18994)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0.44628 + (((tickAnim - 39) / 11) * (81.68974-(0.44628)));
            yy = -9.14806 + (((tickAnim - 39) / 11) * (-12.06805-(-9.14806)));
            zz = -58.03083 + (((tickAnim - 39) / 11) * (-65.71262-(-58.03083)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -82.5 + (((tickAnim - 0) / 13) * (45-(-82.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 45 + (((tickAnim - 13) / 13) * (0-(45)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (-1.9-(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -1.9 + (((tickAnim - 33) / 7) * (-13.77-(-1.9)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -13.77 + (((tickAnim - 40) / 10) * (-82.5-(-13.77)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 26.83569 + (((tickAnim - 0) / 24) * (104.09409-(26.83569)));
            yy = 55.47351 + (((tickAnim - 0) / 24) * (25.36418-(55.47351)));
            zz = -58.40983 + (((tickAnim - 0) / 24) * (-61.82626-(-58.40983)));
        }
        else if (tickAnim >= 24 && tickAnim < 37) {
            xx = 104.09409 + (((tickAnim - 24) / 13) * (59.59797-(104.09409)));
            yy = 25.36418 + (((tickAnim - 24) / 13) * (43.33648-(25.36418)));
            zz = -61.82626 + (((tickAnim - 24) / 13) * (-85.72664-(-61.82626)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 59.59797 + (((tickAnim - 37) / 13) * (26.83569-(59.59797)));
            yy = 43.33648 + (((tickAnim - 37) / 13) * (55.47351-(43.33648)));
            zz = -85.72664 + (((tickAnim - 37) / 13) * (-58.40983-(-85.72664)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(xx), Rightthigh.rotateAngleY + (float) Math.toRadians(yy), Rightthigh.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -64.63428 + (((tickAnim - 0) / 24) * (-52.5-(-64.63428)));
            yy = -15.9553 + (((tickAnim - 0) / 24) * (-17.5-(-15.9553)));
            zz = 5.37732 + (((tickAnim - 0) / 24) * (0-(5.37732)));
        }
        else if (tickAnim >= 24 && tickAnim < 37) {
            xx = -52.5 + (((tickAnim - 24) / 13) * (-21.01345-(-52.5)));
            yy = -17.5 + (((tickAnim - 24) / 13) * (-18.23062-(-17.5)));
            zz = 0 + (((tickAnim - 24) / 13) * (20.73179-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -21.01345 + (((tickAnim - 37) / 13) * (-64.63428-(-21.01345)));
            yy = -18.23062 + (((tickAnim - 37) / 13) * (-15.9553-(-18.23062)));
            zz = 20.73179 + (((tickAnim - 37) / 13) * (5.37732-(20.73179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(xx), Rightshin.rotateAngleY + (float) Math.toRadians(yy), Rightshin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1.26966 + (((tickAnim - 0) / 12) * (-4.18274-(1.26966)));
            yy = -44.87395 + (((tickAnim - 0) / 12) * (5.57427-(-44.87395)));
            zz = 51.69635 + (((tickAnim - 0) / 12) * (50.63557-(51.69635)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = -4.18274 + (((tickAnim - 12) / 12) * (-13.42226-(-4.18274)));
            yy = 5.57427 + (((tickAnim - 12) / 12) * (23.2634-(5.57427)));
            zz = 50.63557 + (((tickAnim - 12) / 12) * (48.52821-(50.63557)));
        }
        else if (tickAnim >= 24 && tickAnim < 37) {
            xx = -13.42226 + (((tickAnim - 24) / 13) * (69.44056-(-13.42226)));
            yy = 23.2634 + (((tickAnim - 24) / 13) * (-15.33173-(23.2634)));
            zz = 48.52821 + (((tickAnim - 24) / 13) * (-3.77607-(48.52821)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 69.44056 + (((tickAnim - 37) / 13) * (1.26966-(69.44056)));
            yy = -15.33173 + (((tickAnim - 37) / 13) * (-44.87395-(-15.33173)));
            zz = -3.77607 + (((tickAnim - 37) / 13) * (51.69635-(-3.77607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(xx), Righthindfootheel.rotateAngleY + (float) Math.toRadians(yy), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 24) / 13) * (45-(0)));
            yy = 0 + (((tickAnim - 24) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 13) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 45 + (((tickAnim - 37) / 13) * (0-(45)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(xx), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(yy), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-40))*-1), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*-0.3);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-90))*1.2), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(0), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-160))*1.2), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-200))*-1.2), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-20))*1.2), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(5.5), Leftupperarm.rotateAngleY + (float) Math.toRadians(22.5), Leftupperarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(68.73276), Leftlowerarm.rotateAngleY + (float) Math.toRadians(-12.9996), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(27.2197));
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(97), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(0), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(5.5), Rightupperarm.rotateAngleY + (float) Math.toRadians(-22.5), Rightupperarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(68.73276), Rightlowerarm.rotateAngleY + (float) Math.toRadians(12.99965), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(-27.21969));
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(97), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(0), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(0), Tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-60))*4), Tailbase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(0), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-90))*9), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(0), Tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-170))*12), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-200))*17), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(0), Tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-280))*22), Tailend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*2), Leftthigh.rotateAngleY + (float) Math.toRadians(-17.4915), Leftthigh.rotateAngleZ + (float) Math.toRadians(66.9466));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-120))*2), Leftshin.rotateAngleY + (float) Math.toRadians(18.3789), Leftshin.rotateAngleZ + (float) Math.toRadians(4.0646));
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(0), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Lefthindfootheel.rotationPointX = this.Lefthindfootheel.rotationPointX + (float)(0);
        this.Lefthindfootheel.rotationPointY = this.Lefthindfootheel.rotationPointY - (float)(0);
        this.Lefthindfootheel.rotationPointZ = this.Lefthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665))*-2), Rightthigh.rotateAngleY + (float) Math.toRadians(17.4915), Rightthigh.rotateAngleZ + (float) Math.toRadians(-66.9466));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*120/0.665-120))*-2), Rightshin.rotateAngleY + (float) Math.toRadians(-18.37893), Rightshin.rotateAngleZ + (float) Math.toRadians(-4.0646));
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Righthindfootheel.rotateAngleY + (float) Math.toRadians(0), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(0);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(0);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlatysuchus entity = (EntityPrehistoricFloraPlatysuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(0), Hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-40))*-2), Hips.rotateAngleZ + (float) Math.toRadians(0));
        this.Hips.rotationPointX = this.Hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-0.8);
        this.Hips.rotationPointY = this.Hips.rotationPointY - (float)(0);
        this.Hips.rotationPointZ = this.Hips.rotationPointZ + (float)(0);
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(0), Bodymiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*2.2), Bodymiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(0), Bodyfront.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-160))*2.2), Bodyfront.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*-2.2), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-20))*2.2), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftupperarm, Leftupperarm.rotateAngleX + (float) Math.toRadians(5.5), Leftupperarm.rotateAngleY + (float) Math.toRadians(22.5), Leftupperarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftlowerarm, Leftlowerarm.rotateAngleX + (float) Math.toRadians(68.73276), Leftlowerarm.rotateAngleY + (float) Math.toRadians(-12.9996), Leftlowerarm.rotateAngleZ + (float) Math.toRadians(27.2197));
        this.setRotateAngle(Leftfrontfoot, Leftfrontfoot.rotateAngleX + (float) Math.toRadians(97), Leftfrontfoot.rotateAngleY + (float) Math.toRadians(0), Leftfrontfoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightupperarm, Rightupperarm.rotateAngleX + (float) Math.toRadians(5.5), Rightupperarm.rotateAngleY + (float) Math.toRadians(-22.5), Rightupperarm.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightlowerarm, Rightlowerarm.rotateAngleX + (float) Math.toRadians(68.73276), Rightlowerarm.rotateAngleY + (float) Math.toRadians(12.99965), Rightlowerarm.rotateAngleZ + (float) Math.toRadians(-27.21969));
        this.setRotateAngle(Rightfrontfoot, Rightfrontfoot.rotateAngleX + (float) Math.toRadians(97), Rightfrontfoot.rotateAngleY + (float) Math.toRadians(0), Rightfrontfoot.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailbase, Tailbase.rotateAngleX + (float) Math.toRadians(0), Tailbase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-60))*8), Tailbase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddlebase, Tailmiddlebase.rotateAngleX + (float) Math.toRadians(0), Tailmiddlebase.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-90))*13), Tailmiddlebase.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddle, Tailmiddle.rotateAngleX + (float) Math.toRadians(0), Tailmiddle.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-170))*16), Tailmiddle.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailmiddleend, Tailmiddleend.rotateAngleX + (float) Math.toRadians(0), Tailmiddleend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-200))*21), Tailmiddleend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tailend, Tailend.rotateAngleX + (float) Math.toRadians(0), Tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-280))*26), Tailend.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Leftthigh, Leftthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*4), Leftthigh.rotateAngleY + (float) Math.toRadians(-17.4915), Leftthigh.rotateAngleZ + (float) Math.toRadians(66.9466));
        this.setRotateAngle(Leftshin, Leftshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*4), Leftshin.rotateAngleY + (float) Math.toRadians(18.3789), Leftshin.rotateAngleZ + (float) Math.toRadians(4.0646));
        this.setRotateAngle(Lefthindfootheel, Lefthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Lefthindfootheel.rotateAngleY + (float) Math.toRadians(0), Lefthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Lefthindfootheel.rotationPointX = this.Lefthindfootheel.rotationPointX + (float)(0);
        this.Lefthindfootheel.rotationPointY = this.Lefthindfootheel.rotationPointY - (float)(0);
        this.Lefthindfootheel.rotationPointZ = this.Lefthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Lefthindfoottoes, Lefthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Lefthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Lefthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Rightthigh, Rightthigh.rotateAngleX + (float) Math.toRadians(126.7463+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*-4), Rightthigh.rotateAngleY + (float) Math.toRadians(17.4915), Rightthigh.rotateAngleZ + (float) Math.toRadians(-66.9466));
        this.setRotateAngle(Rightshin, Rightshin.rotateAngleX + (float) Math.toRadians(-58.9643+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-4), Rightshin.rotateAngleY + (float) Math.toRadians(-18.37893), Rightshin.rotateAngleZ + (float) Math.toRadians(-4.0646));
        this.setRotateAngle(Righthindfootheel, Righthindfootheel.rotateAngleX + (float) Math.toRadians(97.75), Righthindfootheel.rotateAngleY + (float) Math.toRadians(0), Righthindfootheel.rotateAngleZ + (float) Math.toRadians(0));
        this.Righthindfootheel.rotationPointX = this.Righthindfootheel.rotationPointX + (float)(0);
        this.Righthindfootheel.rotationPointY = this.Righthindfootheel.rotationPointY - (float)(0);
        this.Righthindfootheel.rotationPointZ = this.Righthindfootheel.rotationPointZ + (float)(-0.625);
        this.setRotateAngle(Righthindfoottoes, Righthindfoottoes.rotateAngleX + (float) Math.toRadians(23), Righthindfoottoes.rotateAngleY + (float) Math.toRadians(0), Righthindfoottoes.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPlatysuchus e = (EntityPrehistoricFloraPlatysuchus) entity;
        animator.update(entity);

            animator.setAnimation(e.ROAR_ANIMATION);
            animator.startKeyframe(10);
            animator.rotate(Neck, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(Lowerjawback, (float) Math.toRadians(17), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(10);
            animator.resetKeyframe(10);


    }
}
